package ExceptionHandling;

class FileNotSupported extends Exception{
    public FileNotSupported(String message) {
        super(message);
    }
}

class FileSizeLimitation extends Exception{
    public FileSizeLimitation(String message) {
        super(message);
    }
}

class FileUpload{
    private String name;
    private long size;
    private String type;

    public FileUpload(String name, long size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}

class FileUploadService{
    private static final long maxFileSize = 100000;
    private static final String[] fileSupported = {"jpg","png","pdf"};

    public void fileUpload(FileUpload file) throws FileNotSupported, FileSizeLimitation{
        if(file.getSize() > maxFileSize){
            throw new FileSizeLimitation("File exceed max size of " + maxFileSize + " bytes");
        }

        boolean isSupported = false;
        for(String fileType : fileSupported){
            if(file.getType().equals(fileType)) {
                isSupported = true;
                break;
            }
        }
        if(!isSupported){
            throw new FileSizeLimitation("File type " + file.getType() + " not supported");
        }
        System.out.println("File Uploaded");
    }
}

public class FileUploadMain {
    public static void main(String[] args) {

        try {
            FileUpload fu = new FileUpload("Swapnil",10000,"pdf");
            FileUpload fu1 = new FileUpload("Oliver",120000000,"Image/jpg");
            FileUploadService fileService = new FileUploadService();
            fileService.fileUpload(fu);
            fileService.fileUpload(fu1);
        } catch (FileNotSupported e) {
            System.out.println(e.getMessage());
        } catch (FileSizeLimitation e) {
            System.out.println(e.getMessage());
        }
    }
}
