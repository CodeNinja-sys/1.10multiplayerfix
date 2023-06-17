/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.FileNotFoundException;

public class dej
extends FileNotFoundException {
    public dej(File file, String string) {
        super(String.format("'%s' in ResourcePack '%s'", string, file));
    }
}

