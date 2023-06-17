/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class anq {
    private static final d c = org.apache.logging.log4j.c.c();
    private static final IntBuffer d = avj.d(0x400000);
    public static final cze a = new cze(16, 16);
    public static final int[] b = a.c();
    private static final float[] e;
    private static final int[] f;

    private static float d(int n2) {
        return e[n2 & 0xFF];
    }

    public static int a() {
        return cja.x();
    }

    public static void a(int n2) {
        cja.h(n2);
    }

    public static int a(int n2, BufferedImage bufferedImage) {
        return anq.a(n2, bufferedImage, false, false);
    }

    public static void a(int n2, int[] arrn, int n3, int n4) {
        anq.b(n2);
        anq.a(0, arrn, n3, n4, 0, 0, false, false, false);
    }

    public static int[][] a(int n2, int n3, int[][] arrn) {
        int[][] arrarrn = new int[n2 + 1][];
        arrarrn[0] = arrn[0];
        if (n2 > 0) {
            int n4;
            boolean bl2 = false;
            for (n4 = 0; n4 < arrn.length; ++n4) {
                if (arrn[0][n4] >> 24 != 0) continue;
                bl2 = true;
                break;
            }
            for (n4 = 1; n4 <= n2; ++n4) {
                if (arrn[n4] != null) {
                    arrarrn[n4] = arrn[n4];
                    continue;
                }
                int[] arrn2 = arrarrn[n4 - 1];
                int[] arrn3 = new int[arrn2.length >> 2];
                int n5 = n3 >> n4;
                int n6 = arrn3.length / n5;
                int n7 = n5 << 1;
                for (int i2 = 0; i2 < n5; ++i2) {
                    for (int i3 = 0; i3 < n6; ++i3) {
                        int n8 = 2 * (i2 + i3 * n7);
                        arrn3[i2 + i3 * n5] = anq.a(arrn2[n8 + 0], arrn2[n8 + 1], arrn2[n8 + 0 + n7], arrn2[n8 + 1 + n7], bl2);
                    }
                }
                arrarrn[n4] = arrn3;
            }
        }
        return arrarrn;
    }

    private static int a(int n2, int n3, int n4, int n5, boolean bl2) {
        if (bl2) {
            int n6;
            anq.f[0] = n2;
            anq.f[1] = n3;
            anq.f[2] = n4;
            anq.f[3] = n5;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (n6 = 0; n6 < 4; ++n6) {
                if (f[n6] >> 24 == 0) continue;
                f2 += anq.d(f[n6] >> 24);
                f3 += anq.d(f[n6] >> 16);
                f4 += anq.d(f[n6] >> 8);
                f5 += anq.d(f[n6] >> 0);
            }
            n6 = (int)(Math.pow(f2 /= 4.0f, 0.45454545454545453) * 255.0);
            int n7 = (int)(Math.pow(f3 /= 4.0f, 0.45454545454545453) * 255.0);
            int n8 = (int)(Math.pow(f4 /= 4.0f, 0.45454545454545453) * 255.0);
            int n9 = (int)(Math.pow(f5 /= 4.0f, 0.45454545454545453) * 255.0);
            if (n6 < 96) {
                n6 = 0;
            }
            return n6 << 24 | n7 << 16 | n8 << 8 | n9;
        }
        int n10 = anq.a(n2, n3, n4, n5, 24);
        int n11 = anq.a(n2, n3, n4, n5, 16);
        int n12 = anq.a(n2, n3, n4, n5, 8);
        int n13 = anq.a(n2, n3, n4, n5, 0);
        return n10 << 24 | n11 << 16 | n12 << 8 | n13;
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        float f2 = anq.d(n2 >> n6);
        float f3 = anq.d(n3 >> n6);
        float f4 = anq.d(n4 >> n6);
        float f5 = anq.d(n5 >> n6);
        float f6 = (float)((double)((float)Math.pow((double)(f2 + f3 + f4 + f5) * 0.25, 0.45454545454545453)));
        return (int)((double)f6 * 255.0);
    }

    public static void a(int[][] arrn, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            int[] arrn2 = arrn[i2];
            anq.a(i2, arrn2, n2 >> i2, n3 >> i2, n4 >> i2, n5 >> i2, bl2, bl3, arrn.length > 1);
        }
    }

    private static void a(int n2, int[] arrn, int n3, int n4, int n5, int n6, boolean bl2, boolean bl3, boolean bl4) {
        int n7;
        int n8 = 0x400000 / n3;
        anq.a(bl2, bl4);
        anq.a(bl3);
        for (int i2 = 0; i2 < n3 * n4; i2 += n3 * n7) {
            int n9 = i2 / n3;
            n7 = Math.min(n8, n4 - n9);
            int n10 = n3 * n7;
            anq.b(arrn, i2, n10);
            cja.b(3553, n2, n5, n6 + n9, n3, n7, 32993, 33639, d);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, boolean bl2, boolean bl3) {
        anq.a(n2, bufferedImage.getWidth(), bufferedImage.getHeight());
        return anq.a(n2, bufferedImage, 0, 0, bl2, bl3);
    }

    public static void a(int n2, int n3, int n4) {
        anq.a(n2, 0, n3, n4);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        anq.a(n2);
        anq.b(n2);
        if (n3 >= 0) {
            cja.b(3553, 33085, n3);
            cja.b(3553, 33082, 0);
            cja.b(3553, 33083, n3);
            cja.b(3553, 34049, 0.0f);
        }
        for (int i2 = 0; i2 <= n3; ++i2) {
            cja.a(3553, i2, 6408, n4 >> i2, n5 >> i2, 0, 32993, 33639, null);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, int n3, int n4, boolean bl2, boolean bl3) {
        anq.b(n2);
        anq.a(bufferedImage, n3, n4, bl2, bl3);
        return n2;
    }

    private static void a(BufferedImage bufferedImage, int n2, int n3, boolean bl2, boolean bl3) {
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        int n6 = 0x400000 / n4;
        int[] arrn = new int[n6 * n4];
        anq.b(bl2);
        anq.a(bl3);
        for (int i2 = 0; i2 < n4 * n5; i2 += n4 * n6) {
            int n7 = i2 / n4;
            int n8 = Math.min(n6, n5 - n7);
            int n9 = n4 * n8;
            bufferedImage.getRGB(0, n7, n4, n8, arrn, 0, n4);
            anq.a(arrn, n9);
            cja.b(3553, 0, n2, n3 + n7, n4, n8, 32993, 33639, d);
        }
    }

    private static void a(boolean bl2) {
        if (bl2) {
            cja.b(3553, 10242, 10496);
            cja.b(3553, 10243, 10496);
        } else {
            cja.b(3553, 10242, 10497);
            cja.b(3553, 10243, 10497);
        }
    }

    private static void b(boolean bl2) {
        anq.a(bl2, false);
    }

    private static void a(boolean bl2, boolean bl3) {
        if (bl2) {
            cja.b(3553, 10241, bl3 ? 9987 : 9729);
            cja.b(3553, 10240, 9729);
        } else {
            cja.b(3553, 10241, bl3 ? 9986 : 9728);
            cja.b(3553, 10240, 9728);
        }
    }

    private static void a(int[] arrn, int n2) {
        anq.b(arrn, 0, n2);
    }

    private static void b(int[] arrn, int n2, int n3) {
        int[] arrn2 = arrn;
        if (bxy.B().u.f) {
            arrn2 = anq.a(arrn);
        }
        d.clear();
        d.put(arrn2, n2, n3);
        d.position(0).limit(n3);
    }

    static void b(int n2) {
        cja.i(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int[] a(akx akx2, bpx bpx2) {
        dbr dbr2 = null;
        try {
            dbr2 = akx2.a(bpx2);
            BufferedImage bufferedImage = anq.a(dbr2.b());
            int n2 = bufferedImage.getWidth();
            int n3 = bufferedImage.getHeight();
            int[] arrn = new int[n2 * n3];
            bufferedImage.getRGB(0, 0, n2, n3, arrn, 0, n2);
            int[] arrn2 = arrn;
            return arrn2;
        }
        finally {
            t.a(dbr2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static BufferedImage a(InputStream inputStream) {
        try {
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            return bufferedImage;
        }
        finally {
            t.a(inputStream);
        }
    }

    public static int[] a(int[] arrn) {
        int[] arrn2 = new int[arrn.length];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn2[i2] = anq.c(arrn[i2]);
        }
        return arrn2;
    }

    public static int c(int n2) {
        int n3 = n2 >> 24 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n2 >> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        int n7 = (n4 * 30 + n5 * 59 + n6 * 11) / 100;
        int n8 = (n4 * 30 + n5 * 70) / 100;
        int n9 = (n4 * 30 + n6 * 70) / 100;
        return n3 << 24 | n7 << 16 | n8 << 8 | n9;
    }

    public static void a(int[] arrn, int n2, int n3) {
        int[] arrn2 = new int[n2];
        int n4 = n3 / 2;
        for (int i2 = 0; i2 < n4; ++i2) {
            System.arraycopy(arrn, i2 * n2, arrn2, 0, n2);
            System.arraycopy(arrn, (n3 - 1 - i2) * n2, arrn, i2 * n2, n2);
            System.arraycopy(arrn2, 0, arrn, (n3 - 1 - i2) * n2, n2);
        }
    }

    static {
        int n2 = -16777216;
        int n3 = -524040;
        int[] arrn = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
        int[] arrn2 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
        int n4 = arrn.length;
        for (int i2 = 0; i2 < 16; ++i2) {
            System.arraycopy(i2 < n4 ? arrn : arrn2, 0, b, 16 * i2, n4);
            System.arraycopy(i2 < n4 ? arrn2 : arrn, 0, b, 16 * i2 + n4, n4);
        }
        a.b();
        e = new float[256];
        for (n2 = 0; n2 < e.length; ++n2) {
            anq.e[n2] = (float)Math.pow((float)n2 / 255.0f, 2.2);
        }
        f = new int[4];
    }
}

