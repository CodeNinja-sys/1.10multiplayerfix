/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.e;
import com.sun.jna.a.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class g
extends e {
    private g() {
    }

    private File c() {
        File file;
        File file2 = new File(System.getProperty("user.home"));
        File file3 = new File(file2, ".Trash");
        if (!(file3.exists() || (file3 = new File(file2, "Trash")).exists() || !(file = new File(file2, "Desktop")).exists() || (file3 = new File(file, ".Trash")).exists() || (file3 = new File(file, "Trash")).exists())) {
            file3 = new File(System.getProperty("fileutils.trash", "Trash"));
        }
        return file3;
    }

    public boolean a() {
        return this.c().exists();
    }

    public void a(File[] arrfile) {
        File file = this.c();
        if (!file.exists()) {
            throw new IOException("No trash location found (define fileutils.trash to be the path to the trash)");
        }
        ArrayList<File> arrayList = new ArrayList<File>();
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            File file2 = arrfile[i2];
            File file3 = new File(file, file2.getName());
            if (file2.renameTo(file3)) continue;
            arrayList.add(file2);
        }
        if (arrayList.size() > 0) {
            throw new IOException("The following files could not be trashed: " + arrayList);
        }
    }

    /* synthetic */ g(f f2) {
        this();
    }
}

