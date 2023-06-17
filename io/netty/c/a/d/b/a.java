/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.bi;
import io.netty.c.a.d.ac;
import io.netty.c.a.d.b.b;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public abstract class a
extends b {
    private static final g g = io.netty.util.c.b.h.a(a.class);
    protected File a;
    private boolean h;
    private FileChannel i;

    protected a(String string, Charset charset, long l2) {
        super(string, charset, l2);
    }

    protected abstract String e();

    protected abstract String f();

    protected abstract String g();

    protected abstract String h();

    protected abstract boolean i();

    private File u() {
        String string = this.e();
        String string2 = string != null ? '_' + string : this.h();
        File file = this.g() == null ? File.createTempFile(this.f(), string2) : File.createTempFile(this.f(), string2, new File(this.g()));
        if (this.i()) {
            file.deleteOnExit();
        }
        return file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(io.netty.b.g g2) {
        if (g2 == null) {
            throw new NullPointerException("buffer");
        }
        try {
            this.d = g2.r();
            if (this.c > 0L && this.c < this.d) {
                throw new IOException("Out of size: " + this.d + " > " + this.c);
            }
            if (this.a == null) {
                this.a = this.u();
            }
            if (g2.r() == 0) {
                this.a.createNewFile();
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(this.a);
            FileChannel fileChannel = fileOutputStream.getChannel();
            ByteBuffer byteBuffer = g2.U();
            int n2 = 0;
            while ((long)n2 < this.d) {
                n2 += fileChannel.write(byteBuffer);
            }
            g2.g(g2.p() + n2);
            fileChannel.force(false);
            fileChannel.close();
            fileOutputStream.close();
            this.f = true;
        }
        finally {
            g2.ad();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(io.netty.b.g g2, boolean bl2) {
        if (g2 != null) {
            try {
                int n2 = g2.r();
                if (this.c > 0L && this.c < this.d + (long)n2) {
                    throw new IOException("Out of size: " + (this.d + (long)n2) + " > " + this.c);
                }
                ByteBuffer byteBuffer = g2.T() == 1 ? g2.U() : g2.Q().U();
                int n3 = 0;
                if (this.a == null) {
                    this.a = this.u();
                }
                if (this.i == null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.a);
                    this.i = fileOutputStream.getChannel();
                }
                while (n3 < n2) {
                    n3 += this.i.write(byteBuffer);
                }
                this.d += (long)n2;
                g2.g(g2.p() + n3);
            }
            finally {
                g2.ad();
            }
        }
        if (bl2) {
            if (this.a == null) {
                this.a = this.u();
            }
            if (this.i == null) {
                FileOutputStream fileOutputStream = new FileOutputStream(this.a);
                this.i = fileOutputStream.getChannel();
            }
            this.i.force(false);
            this.i.close();
            this.i = null;
            this.f = true;
        } else if (g2 == null) {
            throw new NullPointerException("buffer");
        }
    }

    @Override
    public void a(File file) {
        if (this.a != null) {
            this.j();
        }
        this.a = file;
        this.d = file.length();
        this.h = true;
        this.f = true;
    }

    @Override
    public void a(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputStream");
        }
        if (this.a != null) {
            this.j();
        }
        this.a = this.u();
        FileOutputStream fileOutputStream = new FileOutputStream(this.a);
        FileChannel fileChannel = fileOutputStream.getChannel();
        byte[] arrby = new byte[16384];
        ByteBuffer byteBuffer = ByteBuffer.wrap(arrby);
        int n2 = inputStream.read(arrby);
        int n3 = 0;
        while (n2 > 0) {
            byteBuffer.position(n2).flip();
            n3 += fileChannel.write(byteBuffer);
            n2 = inputStream.read(arrby);
        }
        fileChannel.force(false);
        fileChannel.close();
        this.d = n3;
        if (this.c > 0L && this.c < this.d) {
            this.a.delete();
            this.a = null;
            throw new IOException("Out of size: " + this.d + " > " + this.c);
        }
        this.h = true;
        this.f = true;
    }

    @Override
    public void j() {
        if (this.i != null) {
            try {
                this.i.force(false);
                this.i.close();
            }
            catch (IOException iOException) {
                g.d("Failed to close a file.", iOException);
            }
            this.i = null;
        }
        if (!this.h) {
            if (this.a != null && this.a.exists()) {
                this.a.delete();
            }
            this.a = null;
        }
    }

    @Override
    public byte[] k() {
        if (this.a == null) {
            return io.netty.util.c.d.a;
        }
        return io.netty.c.a.d.b.a.c(this.a);
    }

    @Override
    public io.netty.b.g l() {
        if (this.a == null) {
            return bi.c;
        }
        byte[] arrby = io.netty.c.a.d.b.a.c(this.a);
        return bi.a(arrby);
    }

    @Override
    public io.netty.b.g b(int n2) {
        int n3;
        int n4;
        if (this.a == null || n2 == 0) {
            return bi.c;
        }
        if (this.i == null) {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            this.i = fileInputStream.getChannel();
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n2);
        for (n3 = 0; n3 < n2; n3 += n4) {
            n4 = this.i.read(byteBuffer);
            if (n4 != -1) continue;
            this.i.close();
            this.i = null;
            break;
        }
        if (n3 == 0) {
            return bi.c;
        }
        byteBuffer.flip();
        io.netty.b.g g2 = bi.a(byteBuffer);
        g2.g(0);
        g2.h(n3);
        return g2;
    }

    @Override
    public String m() {
        return this.a(ac.j);
    }

    @Override
    public String a(Charset charset) {
        if (this.a == null) {
            return "";
        }
        if (charset == null) {
            byte[] arrby = io.netty.c.a.d.b.a.c(this.a);
            return new String(arrby, ac.j.name());
        }
        byte[] arrby = io.netty.c.a.d.b.a.c(this.a);
        return new String(arrby, charset.name());
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public boolean b(File file) {
        if (file == null) {
            throw new NullPointerException("dest");
        }
        if (this.a == null) {
            throw new IOException("No file defined so cannot be renamed");
        }
        if (!this.a.renameTo(file)) {
            long l2;
            FileInputStream fileInputStream = new FileInputStream(this.a);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel fileChannel = fileInputStream.getChannel();
            FileChannel fileChannel2 = fileOutputStream.getChannel();
            int n2 = 8196;
            for (l2 = 0L; l2 < this.d; l2 += fileChannel.transferTo(l2, n2, fileChannel2)) {
                if ((long)n2 >= this.d - l2) continue;
                n2 = (int)(this.d - l2);
            }
            fileChannel.close();
            fileChannel2.close();
            if (l2 == this.d) {
                this.a.delete();
                this.a = file;
                this.h = true;
                return true;
            }
            file.delete();
            return false;
        }
        this.a = file;
        this.h = true;
        return true;
    }

    private static byte[] c(File file) {
        long l2 = file.length();
        if (l2 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("File too big to be loaded in memory");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel fileChannel = fileInputStream.getChannel();
        byte[] arrby = new byte[(int)l2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(arrby);
        int n2 = 0;
        while ((long)n2 < l2) {
            n2 += fileChannel.read(byteBuffer);
        }
        fileChannel.close();
        return arrby;
    }

    @Override
    public File o() {
        return this.a;
    }
}

