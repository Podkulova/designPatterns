package src.p09_prototype;

public class JavaCodeFilesmanager {
    private static final JavaCodeFile BASE_FILE = new JavaCodeFile("SDA License", "java");

    public JavaCodeFile createFileWithContent(final String fileName, final String content) throws CloneNotSupportedException {
        JavaCodeFile baseFileClone = BASE_FILE.createClone(); // Use of the prototype
        baseFileClone.setCode(content); // setting the rest of the object's fields
        baseFileClone.setFilename(fileName);
        return baseFileClone;
    }
}
