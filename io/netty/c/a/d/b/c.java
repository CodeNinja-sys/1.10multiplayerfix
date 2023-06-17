/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ac;
import io.netty.c.a.d.b.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public abstract class c
extends b {
    private g g;
    private int h;
    protected boolean a;

    protected c(String string, Charset charset, long l2) {
        super(string, charset, l2);
    }

    @Override
    public void a(g g2) {
        if (g2 == null) {
            throw new NullPointerException("buffer");
        }
        long l2 = g2.r();
        if (this.c > 0L && this.c < l2) {
            throw new IOException("Out of size: " + l2 + " > " + this.c);
        }
        if (this.g != null) {
            this.g.ad();
        }
        this.g = g2;
        this.d = l2;
        this.f = true;
    }

    @Override
    public void a(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputStream");
        }
        g g2 = bi.a();
        byte[] arrby = new byte[16384];
        int n2 = inputStream.read(arrby);
        int n3 = 0;
        while (n2 > 0) {
            g2.b(arrby, 0, n2);
            n3 += n2;
            n2 = inputStream.read(arrby);
        }
        this.d = n3;
        if (this.c > 0L && this.c < this.d) {
            throw new IOException("Out of size: " + this.d + " > " + this.c);
        }
        if (this.g != null) {
            this.g.ad();
        }
        this.g = g2;
        this.f = true;
    }

    @Override
    public void a(g g2, boolean bl2) {
        if (g2 != null) {
            long l2 = g2.r();
            if (this.c > 0L && this.c < this.d + l2) {
                throw new IOException("Out of size: " + (this.d + l2) + " > " + this.c);
            }
            this.d += l2;
            if (this.g == null) {
                this.g = g2;
            } else if (this.g instanceof io.netty.b.ac) {
                io.netty.b.ac ac2 = (io.netty.b.ac)this.g;
                ac2.d(g2);
                ac2.Y(ac2.q() + g2.r());
            } else {
                io.netty.b.ac ac3 = bi.c(Integer.MAX_VALUE);
                ac3.a(this.g, g2);
                ac3.Y(this.g.r() + g2.r());
                this.g = ac3;
            }
        }
        if (bl2) {
            this.f = true;
        } else if (g2 == null) {
            throw new NullPointerException("buffer");
        }
    }

    @Override
    public void a(File file) {
        if (file == null) {
            throw new NullPointerException("file");
        }
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
        fileInputStream.close();
        byteBuffer.flip();
        if (this.g != null) {
            this.g.ad();
        }
        this.g = bi.a(Integer.MAX_VALUE, byteBuffer);
        this.d = l2;
        this.f = true;
    }

    @Override
    public void j() {
        if (this.g != null) {
            this.g.ad();
            this.g = null;
        }
    }

    @Override
    public byte[] k() {
        if (this.g == null) {
            return bi.c.X();
        }
        byte[] arrby = new byte[this.g.r()];
        this.g.a(this.g.p(), arrby);
        return arrby;
    }

    @Override
    public String m() {
        return this.a(ac.j);
    }

    @Override
    public String a(Charset charset) {
        if (this.g == null) {
            return "";
        }
        if (charset == null) {
            charset = ac.j;
        }
        return this.g.a(charset);
    }

    @Override
    public g l() {
        return this.g;
    }

    @Override
    public g b(int n2) {
        if (this.g == null || n2 == 0 || this.g.r() == 0) {
            this.h = 0;
            return bi.c;
        }
        int n3 = this.g.r() - this.h;
        if (n3 == 0) {
            this.h = 0;
            return bi.c;
        }
        int n4 = n2;
        if (n3 < n2) {
            n4 = n3;
        }
        g g2 = this.g.i(this.h, n4).ab();
        this.h += n4;
        return g2;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public boolean b(File file) {
        int n2;
        if (file == null) {
            throw new NullPointerException("dest");
        }
        if (this.g == null) {
            file.createNewFile();
            this.a = true;
            return true;
        }
        int n3 = this.g.r();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel fileChannel = fileOutputStream.getChannel();
        if (this.g.T() == 1) {
            ByteBuffer byteBuffer = this.g.U();
            for (n2 = 0; n2 < n3; n2 += fileChannel.write(byteBuffer)) {
            }
        } else {
            ByteBuffer[] arrbyteBuffer = this.g.V();
            while (n2 < n3) {
                n2 = (int)((long)n2 + fileChannel.write(arrbyteBuffer));
            }
        }
        fileChannel.force(false);
        fileChannel.close();
        fileOutputStream.close();
        this.a = true;
        return n2 == n3;
    }

    @Override
    public File o() {
        throw new IOException("Not represented by a file");
    }
}

