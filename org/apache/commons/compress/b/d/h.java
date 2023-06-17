/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.ZipFile;

public class h {
    private h() {
    }

    public static void a(File file) {
        h.a(file, file, null);
    }

    public static void a(File file, Map map) {
        h.a(file, file, map);
    }

    public static void a(File file, File file2) {
        h.a(file, file2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, File file2, Map hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap<String, String>();
        }
        hashMap.put("pack.segment.limit", "-1");
        File file3 = File.createTempFile("commons-compress", "pack200normalize");
        file3.deleteOnExit();
        try {
            OutputStream outputStream = new FileOutputStream(file3);
            ZipFile zipFile = null;
            try {
                Pack200.Packer packer = Pack200.newPacker();
                packer.properties().putAll(hashMap);
                zipFile = new JarFile(file);
                packer.pack((JarFile)zipFile, outputStream);
                zipFile = null;
                outputStream.close();
                outputStream = null;
                Pack200.Unpacker unpacker = Pack200.newUnpacker();
                outputStream = new JarOutputStream(new FileOutputStream(file2));
                unpacker.unpack(file3, (JarOutputStream)outputStream);
            }
            finally {
                if (zipFile != null) {
                    zipFile.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
        finally {
            file3.delete();
        }
    }
}

