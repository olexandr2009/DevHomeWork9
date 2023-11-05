package org.example;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.FileTemplateResolver;

import java.io.IOException;
import java.io.Writer;

import static org.example.TimeServletConstants.*;

/**
 * ServletTemplateUtils is a class that used to parse templates with context
 */
public class ServletTemplateUtils {
    private static final TemplateEngine templateEngine = new TemplateEngine();
    private static final FileTemplateResolver templateResolver = new FileTemplateResolver();

    static {
        templateResolver.setPrefix(String.format(PATH_TO_TEMPLATES.getText(), PATH_TO_TOMCAT.getText()));
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML");
        templateEngine.setTemplateResolver(templateResolver);
    }

    public static void processHMTLTemplate(String templateName, Context context, Writer writer) {
        templateEngine.process(templateName, context, writer);
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
