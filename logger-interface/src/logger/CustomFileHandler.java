package logger;

import java.util.logging.FileHandler;

class CustomFileHandler implements AutoCloseable {

    private FileHandler fileHandler;

    public CustomFileHandler(FileHandler fileHandler) {
        this.setFileHandler(fileHandler);
    }

    @Override
    public void close() {
        if (fileHandler != null) {
            fileHandler.close();
        }
    }

    public FileHandler getFileHandler() {
        return fileHandler;
    }

    private void setFileHandler(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

}
