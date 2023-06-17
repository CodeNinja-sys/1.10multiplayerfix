/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.b.b.h;

public class bch
extends gv {
    public bch(File file) {
        super(file);
    }

    @Override
    protected InputStream a(String string) {
        return new BufferedInputStream(new FileInputStream(new File(this.a, string)));
    }

    @Override
    protected boolean b(String string) {
        return new File(this.a, string).isFile();
    }

    @Override
    public Set c() {
        HashSet hashSet = aad.a();
        File file = new File(this.a, "assets/");
        if (file.isDirectory()) {
            for (File file2 : file.listFiles(h.a)) {
                String string = bch.a(file, file2);
                if (string.equals(string.toLowerCase())) {
                    hashSet.add(string.substring(0, string.length() - 1));
                    continue;
                }
                this.c(string);
            }
        }
        return hashSet;
    }
}

