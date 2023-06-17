/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import org.apache.logging.log4j.core.a.c.a.a;

public class d
extends a {
    private final File b;
    private final File c;
    private final boolean d;

    public d(File file, File file2, boolean bl2) {
        this.b = file;
        this.c = file2;
        this.d = bl2;
    }

    @Override
    public boolean a() {
        return org.apache.logging.log4j.core.a.c.a.d.a(this.b, this.c, this.d);
    }

    public static boolean a(File file, File file2, boolean bl2) {
        if (bl2 || file.length() > 0L) {
            File file3 = file2.getParentFile();
            if (file3 != null && !file3.exists() && !file3.mkdirs()) {
                a.b("Unable to create directory {}", file3.getAbsolutePath());
                return false;
            }
            try {
                if (!file.renameTo(file2)) {
                    try {
                        org.apache.logging.log4j.core.a.c.a.d.a(file, file2);
                        return file.delete();
                    }
                    catch (IOException iOException) {
                        a.b("Unable to rename file {} to {} - {}", file.getAbsolutePath(), file2.getAbsolutePath(), iOException.getMessage());
                    }
                }
                return true;
            }
            catch (Exception exception) {
                try {
                    org.apache.logging.log4j.core.a.c.a.d.a(file, file2);
                    return file.delete();
                }
                catch (IOException iOException) {
                    a.b("Unable to rename file {} to {} - {}", file.getAbsolutePath(), file2.getAbsolutePath(), iOException.getMessage());
                }
            }
        } else {
            try {
                file.delete();
            }
            catch (Exception exception) {
                a.b("Unable to delete empty file " + file.getAbsolutePath());
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(File file, File file2) {
        if (!file2.exists()) {
            file2.createNewFile();
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        AbstractInterruptibleChannel abstractInterruptibleChannel2 = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file2);
            abstractInterruptibleChannel = fileInputStream.getChannel();
            abstractInterruptibleChannel2 = fileOutputStream.getChannel();
            ((FileChannel)abstractInterruptibleChannel2).transferFrom((ReadableByteChannel)((Object)abstractInterruptibleChannel), 0L, ((FileChannel)abstractInterruptibleChannel).size());
        }
        finally {
            if (abstractInterruptibleChannel != null) {
                abstractInterruptibleChannel.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (abstractInterruptibleChannel2 != null) {
                abstractInterruptibleChannel2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}

