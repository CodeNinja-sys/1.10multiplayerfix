/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.BufferUtils;

public class fj {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static IntBuffer c;
    private static int[] d;

    public static cbg a(File file, int n2, int n3, btr btr2) {
        return fj.a(file, null, n2, n3, btr2);
    }

    public static cbg a(File file, String string, int n2, int n3, btr btr2) {
        try {
            File file2 = new File(file, "screenshots");
            file2.mkdir();
            BufferedImage bufferedImage = fj.a(n2, n3, btr2);
            File file3 = string == null ? fj.a(file2) : new File(file2, string);
            ImageIO.write((RenderedImage)bufferedImage, "png", file3);
            aym aym2 = new aym(file3.getName());
            aym2.h().a(new cxk(nc.b, file3.getAbsolutePath()));
            aym2.h().d(true);
            return new du("screenshot.success", aym2);
        }
        catch (Exception exception) {
            a.f("Couldn't save screenshot", (Throwable)exception);
            return new du("screenshot.failure", exception.getMessage());
        }
    }

    public static BufferedImage a(int n2, int n3, btr btr2) {
        BufferedImage bufferedImage;
        if (cjg.i()) {
            n2 = btr2.a;
            n3 = btr2.b;
        }
        int n4 = n2 * n3;
        if (c == null || c.capacity() < n4) {
            c = BufferUtils.d(n4);
            d = new int[n4];
        }
        cja.g(3333, 1);
        cja.g(3317, 1);
        c.clear();
        if (cjg.i()) {
            cja.i(btr2.g);
            cja.a(3553, 0, 32993, 33639, c);
        } else {
            cja.a(0, 0, n2, n3, 32993, 33639, c);
        }
        c.get(d);
        anq.a(d, n2, n3);
        if (cjg.i()) {
            int n5;
            bufferedImage = new BufferedImage(btr2.c, btr2.d, 1);
            for (int i2 = n5 = btr2.b - btr2.d; i2 < btr2.b; ++i2) {
                for (int i3 = 0; i3 < btr2.c; ++i3) {
                    bufferedImage.setRGB(i3, i2 - n5, d[i2 * btr2.a + i3]);
                }
            }
        } else {
            bufferedImage = new BufferedImage(n2, n3, 1);
            bufferedImage.setRGB(0, 0, n2, n3, d, 0, n2);
        }
        return bufferedImage;
    }

    private static File a(File file) {
        String string = b.format(new Date()).toString();
        int n2 = 1;
        File file2;
        while ((file2 = new File(file, string + (n2 == 1 ? "" : "_" + n2) + ".png")).exists()) {
            ++n2;
        }
        return file2;
    }
}

