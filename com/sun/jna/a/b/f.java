/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.b;

import com.sun.jna.a.b.g;
import com.sun.jna.a.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class f
extends e {
    public boolean a() {
        return true;
    }

    public void a(File[] arrfile) {
        File file = new File(System.getProperty("user.home"));
        File file2 = new File(file, ".Trash");
        if (!file2.exists()) {
            throw new IOException("The Trash was not found in its expected location (" + file2 + ")");
        }
        ArrayList<File> arrayList = new ArrayList<File>();
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            File file3 = arrfile[i2];
            if (g.l.a(file3.getAbsolutePath(), null, 0) == 0) continue;
            arrayList.add(file3);
        }
        if (arrayList.size() > 0) {
            throw new IOException("The following files could not be trashed: " + arrayList);
        }
    }
}

