/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import net.minecraft.client.g.a.p;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.u.d.a;
import net.minecraft.u.d.a.b;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.BufferUtils;

public class br {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static IntBuffer c;
    private static int[] d;

    public static a a(File file, int n2, int n3, net.minecraft.client.m.b b2) {
        return br.a(file, null, n2, n3, b2);
    }

    public static a a(File file, String string, int n2, int n3, net.minecraft.client.m.b b2) {
        try {
            File file2 = new File(file, "screenshots");
            file2.mkdir();
            BufferedImage bufferedImage = br.a(n2, n3, b2);
            File file3 = string == null ? br.a(file2) : new File(file2, string);
            ImageIO.write((RenderedImage)bufferedImage, "png", file3);
            k k2 = new k(file3.getName());
            k2.a().a(new net.minecraft.u.d.a.a(net.minecraft.u.d.a.b.b, file3.getAbsolutePath()));
            k2.a().d(true);
            return new l("screenshot.success", k2);
        }
        catch (Exception exception) {
            a.f("Couldn't save screenshot", (Throwable)exception);
            return new l("screenshot.failure", exception.getMessage());
        }
    }

    public static BufferedImage a(int n2, int n3, net.minecraft.client.m.b b2) {
        BufferedImage bufferedImage;
        if (ay.i()) {
            n2 = b2.a;
            n3 = b2.b;
        }
        int n4 = n2 * n3;
        if (c == null || c.capacity() < n4) {
            c = BufferUtils.d(n4);
            d = new int[n4];
        }
        bd.g(3333, 1);
        bd.g(3317, 1);
        c.clear();
        if (ay.i()) {
            bd.i(b2.g);
            bd.a(3553, 0, 32993, 33639, c);
        } else {
            bd.a(0, 0, n2, n3, 32993, 33639, c);
        }
        c.get(d);
        p.a(d, n2, n3);
        if (ay.i()) {
            int n5;
            bufferedImage = new BufferedImage(b2.c, b2.d, 1);
            for (int i2 = n5 = b2.b - b2.d; i2 < b2.b; ++i2) {
                for (int i3 = 0; i3 < b2.c; ++i3) {
                    bufferedImage.setRGB(i3, i2 - n5, d[i2 * b2.a + i3]);
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
        while ((file2 = new File(file, String.valueOf(string) + (n2 == 1 ? "" : "_" + n2) + ".png")).exists()) {
            ++n2;
        }
        return file2;
    }
}

