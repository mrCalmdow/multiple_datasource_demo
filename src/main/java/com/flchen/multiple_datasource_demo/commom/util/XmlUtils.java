package com.flchen.multiple_datasource_demo.commom.util;


import com.flchen.multiple_datasource_demo.commom.entity.BaseFileDO;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.List;

/**
 * @author feilongchen
 * @since 2019-03-06 5:35 PM
 */
@Slf4j
@Component
public class XmlUtils<T> {

    public void writeXmlDocument(T dataObj, String encode, String pathAndName) {

        try {
            Long startTime = System.currentTimeMillis();
            XMLWriter xmlWriter = null;

            OutputFormat format = OutputFormat.createCompactFormat();
            format.setEncoding(encode);

            File file = new File(pathAndName);
            if (file.exists()) {
                file.delete();
            }

            Document document = DocumentHelper.createDocument();
            String rootName = dataObj.getClass().getSimpleName();
            Element root = document.addElement(rootName);

            Field[] fields = dataObj.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Element secondElement = null;
                /**
                 * 如果是文件名字段则用于命名文件
                 */
                if ("fileName".equals(field.getName()) || field.getType() == String.class) {
                    root.addElement(field.getName()).setText(field.get(dataObj).toString());
                } else {
                    secondElement = root.addElement(field.getName());
                }

                /**
                 * 如果是输入、输出对象则处理子属性
                 */
                if ("inData".equals(field.getName()) || "outData".equals(field.getName())) {
                    Object obj = field.get(dataObj);
                    Field[] objFiels = obj.getClass().getDeclaredFields();
                    for (Field objField : objFiels) {
                        objField.setAccessible(true);
                        if (null != objField.get(obj)) {
                            secondElement.addElement(objField.getName()).setText(objField.get(obj).toString());
                        } else {
                            secondElement.addElement(objField.getName()).setText("null");
                        }

                        log.info("variable name: {}, variable type: {}, value: {}", objField.getName(), objField.getType().getSimpleName(), objField.get(obj));
                    }
                }
                /**
                 * 如果是检查字段列表则遍历
                 */
                // 处理检查字段列表
                if (field.getType() == List.class && field.getName().equals("wantCheckProperties")) {
                    List<String> wantCheckProperties = (List<String>) field.get(dataObj);
                    for (String str : wantCheckProperties) {
                        secondElement.addElement(str).setText(str);
                    }
                }

                /**
                 * 其他字段如url\method等，正常处理
                 */
//                secondElement.addText(field.get(dataObj).toString());

            }
            xmlWriter = new XMLWriter(new FileWriter(file), format);
            xmlWriter.write(document);
            xmlWriter.close();
            Long endTime = System.currentTimeMillis();
            log.info("写入xml文件 {} 成功, 用时 {} 毫秒", dataObj.getClass().getSimpleName(), endTime - startTime);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("写入xml文件失败");
        }
    }

    public T readXmlDocument(Class<T> tClass, String pathAndName) {
        T t = null;
        return t;
    }
}
