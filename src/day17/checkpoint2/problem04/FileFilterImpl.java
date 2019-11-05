package day17.checkpoint2.problem04;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java")||pathname.isDirectory();
    }
}
