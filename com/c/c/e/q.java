/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.e.r;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.s.n;
import org.apache.commons.a.a.d;
import org.apache.commons.b.t;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public class q {
    private static Map b = new HashMap();
    private static Boolean c;
    public static int a;

    public static void a(String string, String string2) {
        if (string2 == null) {
            n.d("textures/gui/presets/isles.png");
            return;
        }
        int n2 = q.b(string, string2);
        GL11.b(3553, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int b(String string, String string2) {
        int n2;
        Object object;
        if (b.containsKey(string)) {
            object = (r)b.get(string);
            if (((r)object).a.equals(string2)) {
                return ((r)object).b;
            }
            GL11.e(((r)object).b);
            n2 = ((r)object).b;
        } else {
            n2 = GL11.c();
        }
        object = null;
        int n3 = 0;
        int n4 = 0;
        try {
            BufferedImage bufferedImage;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new d().c(string2));
            try {
                bufferedImage = ImageIO.read(byteArrayInputStream);
            }
            finally {
                t.a(byteArrayInputStream);
            }
            n3 = bufferedImage.getWidth();
            n4 = bufferedImage.getHeight();
            int[] arrn = new int[n3 * n4];
            bufferedImage.getRGB(0, 0, n3, n4, arrn, 0, n3);
            object = ByteBuffer.allocateDirect(4 * n3 * n4).order(ByteOrder.nativeOrder()).asIntBuffer();
            ((IntBuffer)object).put(arrn);
            ((IntBuffer)object).flip();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (a == -1) {
            a = q.a() ? 33984 : 33984;
        }
        q.a(a);
        GL11.b(3553, n2);
        GL11.a(3553, 0, 6408, n3, n4, 0, 32993, 33639, (IntBuffer)object);
        GL11.k(3553, 10242, 10497);
        GL11.k(3553, 10243, 10497);
        GL11.k(3553, 10240, 9728);
        GL11.k(3553, 10241, 9729);
        b.put(string, new r(string2, n2));
        return n2;
    }

    public static void a(int n2) {
        if (q.a()) {
            ARBMultitexture.b(n2);
        } else {
            GL13.a(n2);
        }
    }

    public static boolean a() {
        if (c == null) {
            dt dt2 = GLContext.a();
            c = dt2.ba && !dt2.eu;
        }
        return c;
    }

    static {
        a = -1;
    }
}

