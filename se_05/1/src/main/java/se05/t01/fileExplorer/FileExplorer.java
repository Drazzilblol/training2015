package se05.t01.fileExplorer;

import org.apache.commons.io.FileUtils;
import se05.t01.exceptions.ParentFolderDoesntExistException;
import se05.t01.exceptions.RequireCorrectFileNameException;

import java.io.File;
import java.io.IOException;

/**
 * Created by Drazz on 09.11.2015.
 */
public class FileExplorer {
    private File file;

    public FileExplorer(String path) {
        file = new File(path);
    }

    public void printFilesList() {
        System.out.println(file.getPath());
        for (String f : file.list()) {
            System.out.println("|-" + f);
        }
        System.out.println("------------------------------------");
    }

    public void goTo(String folderName) {
        file = new File(file.getPath() + "/" + folderName);
        printFilesList();
    }

    public void back() {
        if (file.getParent() == null) {
            throw new ParentFolderDoesntExistException(file.getPath());
        }
        file = new File(file.getParent());
        printFilesList();
    }

    public void readFile(String fileName) {
        try {
            File readFile = new File(file.getPath() + "/" + fileName);
            if (!readFile.exists() || !readFile.isFile()) {
                throw new RequireCorrectFileNameException("incorrect file name: " + fileName);
            }
            String string = FileUtils.readFileToString(readFile);
            System.out.println("Read in: " + readFile.getPath() + "\n" + string);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RequireCorrectFileNameException e) {
            System.out.println("please write correct file name");
        }

    }

    public void writeFile(String fileName, String data) {
        try {
            File writeFile = new File(file.getPath() + "/" + fileName);
            FileUtils.writeStringToFile(writeFile, data, true);
            System.out.println("Write in: " + writeFile.getPath() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RequireCorrectFileNameException e) {
            System.out.println("please write correct file name");
        }

    }

    public void newDir(String directoryName) {
        File newFile = new File(file.getPath() + "/" + directoryName);
        newFile.mkdir();
    }

    public void deleteFile(String fileName) {
        try {
            File f = new File(file.getPath() + "/" + fileName);
            if (!f.exists()) {
                throw new RequireCorrectFileNameException("incorrect file name: " + fileName);
            }
            f.delete();
            System.out.println("Deleted file: " + f.getPath() + "\n");
        } catch (RequireCorrectFileNameException e) {
            System.out.println("please write correct file name");
        }
    }

}
