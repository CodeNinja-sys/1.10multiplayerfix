/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import com.a.a.d.ov;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import net.minecraft.c.a;
import net.minecraft.q.f.a.n;

public class c {
    private static final byte[] a = new byte[4096];
    private final File b;
    private RandomAccessFile c;
    private final int[] d = new int[1024];
    private final int[] e = new int[1024];
    private List f;
    private int g;
    private long h;

    public c(File file) {
        this.b = file;
        this.g = 0;
        try {
            int n2;
            int n3;
            int n4;
            if (file.exists()) {
                this.h = file.lastModified();
            }
            this.c = new RandomAccessFile(file, "rw");
            if (this.c.length() < 4096L) {
                this.c.write(a);
                this.c.write(a);
                this.g += 8192;
            }
            if ((this.c.length() & 0xFFFL) != 0L) {
                n4 = 0;
                while ((long)n4 < (this.c.length() & 0xFFFL)) {
                    this.c.write(0);
                    ++n4;
                }
            }
            n4 = (int)this.c.length() / 4096;
            this.f = ov.b(n4);
            for (n3 = 0; n3 < n4; ++n3) {
                this.f.add(true);
            }
            this.f.set(0, false);
            this.f.set(1, false);
            this.c.seek(0L);
            for (n3 = 0; n3 < 1024; ++n3) {
                this.d[n3] = n2 = this.c.readInt();
                if (n2 == 0 || (n2 >> 8) + (n2 & 0xFF) > this.f.size()) continue;
                for (int i2 = 0; i2 < (n2 & 0xFF); ++i2) {
                    this.f.set((n2 >> 8) + i2, false);
                }
            }
            for (n3 = 0; n3 < 1024; ++n3) {
                this.e[n3] = n2 = this.c.readInt();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public synchronized DataInputStream a(int n2, int n3) {
        int n4;
        block12: {
            block11: {
                int n5;
                int n6;
                block10: {
                    int n7;
                    block9: {
                        if (this.d(n2, n3)) {
                            return null;
                        }
                        try {
                            n7 = this.e(n2, n3);
                            if (n7 != 0) break block9;
                            return null;
                        }
                        catch (IOException iOException) {
                            return null;
                        }
                    }
                    n6 = n7 >> 8;
                    n5 = n7 & 0xFF;
                    if (n6 + n5 <= this.f.size()) break block10;
                    return null;
                }
                this.c.seek(n6 * 4096);
                n4 = this.c.readInt();
                if (n4 <= 4096 * n5) break block11;
                return null;
            }
            if (n4 > 0) break block12;
            return null;
        }
        byte by2 = this.c.readByte();
        if (by2 == 1) {
            byte[] arrby = new byte[n4 - 1];
            this.c.read(arrby);
            return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrby))));
        }
        if (by2 == 2) {
            byte[] arrby = new byte[n4 - 1];
            this.c.read(arrby);
            return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arrby))));
        }
        return null;
    }

    public DataOutputStream b(int n2, int n3) {
        return this.d(n2, n3) ? null : new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new n(this, n2, n3))));
    }

    protected synchronized void a(int n2, int n3, byte[] arrby, int n4) {
        try {
            int n5 = this.e(n2, n3);
            int n6 = n5 >> 8;
            int n7 = n5 & 0xFF;
            int n8 = (n4 + 5) / 4096 + 1;
            if (n8 >= 256) {
                return;
            }
            if (n6 != 0 && n7 == n8) {
                this.a(n6, arrby, n4);
            } else {
                int n9;
                int n10;
                for (n10 = 0; n10 < n7; ++n10) {
                    this.f.set(n6 + n10, true);
                }
                n10 = this.f.indexOf(true);
                int n11 = 0;
                if (n10 != -1) {
                    for (n9 = n10; n9 < this.f.size(); ++n9) {
                        if (n11 != 0) {
                            n11 = ((Boolean)this.f.get(n9)).booleanValue() ? ++n11 : 0;
                        } else if (((Boolean)this.f.get(n9)).booleanValue()) {
                            n10 = n9;
                            n11 = 1;
                        }
                        if (n11 >= n8) break;
                    }
                }
                if (n11 >= n8) {
                    n6 = n10;
                    this.a(n2, n3, n10 << 8 | n8);
                    for (n9 = 0; n9 < n8; ++n9) {
                        this.f.set(n6 + n9, false);
                    }
                    this.a(n6, arrby, n4);
                } else {
                    this.c.seek(this.c.length());
                    n6 = this.f.size();
                    for (n9 = 0; n9 < n8; ++n9) {
                        this.c.write(a);
                        this.f.add(false);
                    }
                    this.g += 4096 * n8;
                    this.a(n6, arrby, n4);
                    this.a(n2, n3, n6 << 8 | n8);
                }
            }
            this.b(n2, n3, (int)(net.minecraft.c.a.aI() / 1000L));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void a(int n2, byte[] arrby, int n3) {
        this.c.seek(n2 * 4096);
        this.c.writeInt(n3 + 1);
        this.c.writeByte(2);
        this.c.write(arrby, 0, n3);
    }

    private boolean d(int n2, int n3) {
        return n2 < 0 || n2 >= 32 || n3 < 0 || n3 >= 32;
    }

    private int e(int n2, int n3) {
        return this.d[n2 + n3 * 32];
    }

    public boolean c(int n2, int n3) {
        return this.e(n2, n3) != 0;
    }

    private void a(int n2, int n3, int n4) {
        this.d[n2 + n3 * 32] = n4;
        this.c.seek((n2 + n3 * 32) * 4);
        this.c.writeInt(n4);
    }

    private void b(int n2, int n3, int n4) {
        this.e[n2 + n3 * 32] = n4;
        this.c.seek(4096 + (n2 + n3 * 32) * 4);
        this.c.writeInt(n4);
    }

    public void a() {
        if (this.c != null) {
            this.c.close();
        }
    }
}

