/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.b.b;
import org.apache.commons.b.o;
import org.apache.commons.b.t;

public class i
extends Writer {
    private static final String a = ".lck";
    private final Writer b;
    private final File c;

    public i(String string) {
        this(string, false, null);
    }

    public i(String string, boolean bl2) {
        this(string, bl2, null);
    }

    public i(String string, boolean bl2, String string2) {
        this(new File(string), bl2, string2);
    }

    public i(File file) {
        this(file, false, null);
    }

    public i(File file, boolean bl2) {
        this(file, bl2, null);
    }

    public i(File file, boolean bl2, String string) {
        this(file, Charset.defaultCharset(), bl2, string);
    }

    public i(File file, Charset charset) {
        this(file, charset, false, null);
    }

    public i(File file, String string) {
        this(file, string, false, null);
    }

    public i(File file, Charset charset, boolean bl2, String string) {
        file = file.getAbsoluteFile();
        if (file.getParentFile() != null) {
            o.m(file.getParentFile());
        }
        if (file.isDirectory()) {
            throw new IOException("File specified is a directory");
        }
        if (string == null) {
            string = System.getProperty("java.io.tmpdir");
        }
        File file2 = new File(string);
        o.m(file2);
        this.a(file2);
        this.c = new File(file2, file.getName() + a);
        this.a();
        this.b = this.a(file, charset, bl2);
    }

    public i(File file, String string, boolean bl2, String string2) {
        this(file, org.apache.commons.b.b.a(string), bl2, string2);
    }

    private void a(File file) {
        if (!file.exists()) {
            throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
        }
        if (!file.canWrite()) {
            throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        Class<i> class_ = i.class;
        synchronized (i.class) {
            if (!this.c.createNewFile()) {
                throw new IOException("Can't write file, lock " + this.c.getAbsolutePath() + " exists");
            }
            this.c.deleteOnExit();
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    private Writer a(File file, Charset charset, boolean bl2) {
        boolean bl3 = file.exists();
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream(file.getAbsolutePath(), bl2);
            outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, org.apache.commons.b.b.a(charset));
        }
        catch (IOException iOException) {
            t.a(outputStreamWriter);
            t.a(fileOutputStream);
            o.e(this.c);
            if (!bl3) {
                o.e(file);
            }
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            t.a(outputStreamWriter);
            t.a(fileOutputStream);
            o.e(this.c);
            if (!bl3) {
                o.e(file);
            }
            throw runtimeException;
        }
        return outputStreamWriter;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        try {
            this.b.close();
        }
        finally {
            this.c.delete();
        }
    }

    @Override
    public void write(int n2) {
        this.b.write(n2);
    }

    @Override
    public void write(char[] arrc) {
        this.b.write(arrc);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        this.b.write(arrc, n2, n3);
    }

    @Override
    public void write(String string) {
        this.b.write(string);
    }

    @Override
    public void write(String string, int n2, int n3) {
        this.b.write(string, n2, n3);
    }

    @Override
    public void flush() {
        this.b.flush();
    }
}

