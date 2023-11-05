package org.example;

public enum TimeServletConstants {
    DEFAULT_CONTENT_TYPE("text/html"),
    COOKIE_LAST_TIMEZONE_NAME("lastTimezone"),
    PARAMETER_NAME("timezone"),
    /**
     * Need to be set by yourself by path to Tomcat without "C:"
     */
    PATH_TO_TOMCAT("/Programs/Tomcat/apache-tomcat-9.0.82"),
    PATH_TO_TEMPLATES("%s/webapps/timeServlet/templates/");

    private final String text;
    TimeServletConstants(String text){
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
