package Lab2.Exceptions;

import java.io.FileNotFoundException;

public class FileDoesNotExistExp extends FileNotFoundException {

    private int detail;

    public FileDoesNotExistExp(int a){detail = a;}

    @Override
    public String toString(){
        return "FileDoesNotExistExp{" + "detail=" + detail + '}';
    }
}
