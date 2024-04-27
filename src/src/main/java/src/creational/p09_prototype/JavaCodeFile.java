package src.creational.p09_prototype;

public class JavaCodeFile implements Cloneable{
    private String licenseContent;
    private String code;
    private String filename;
    private String fileExtension;

    public JavaCodeFile(final String licenseContent, final String fileExtension) {
        this.licenseContent = licenseContent;
        this.fileExtension = fileExtension;
    }

    public JavaCodeFile(String licenseContent, String code, String filename, String fileExtension) {
        this.licenseContent = licenseContent;
        this.code = code;
        this.filename = filename;
        this.fileExtension = fileExtension;
    }

    public String getLicenseContent() {
        return licenseContent;
    }

    public void setLicenseContent(String licenseContent) {
        this.licenseContent = licenseContent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }
    public JavaCodeFile createClone() throws CloneNotSupportedException {
        return (JavaCodeFile)clone();
    }

    @Override
    public String toString() {
        return "JavaCodeFile{" +
                "licenseContent='" + licenseContent + '\'' +
                ", code='" + code + '\'' +
                ", filename='" + filename + '\'' +
                ", fileExtension='" + fileExtension + '\'' +
                '}';
    }
}
