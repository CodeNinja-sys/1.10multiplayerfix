/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.e;

public final class Lister {
    private static final e a = new e();

    public static void main(String[] arrstring) {
        a a2;
        if (arrstring.length == 0) {
            Lister.a();
            return;
        }
        System.out.println("Analysing " + arrstring[0]);
        File file = new File(arrstring[0]);
        if (!file.isFile()) {
            System.err.println(file + " doesn't exist or is a directory");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        c c2 = arrstring.length > 1 ? a.a(arrstring[1], bufferedInputStream) : a.a(bufferedInputStream);
        System.out.println("Created " + c2.toString());
        while ((a2 = c2.a()) != null) {
            System.out.println(a2.getName());
        }
        c2.close();
        ((InputStream)bufferedInputStream).close();
    }

    private static void a() {
        System.out.println("Parameters: archive-name [archive-type]");
    }
}

