/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import net.minecraft.client.f.a.h;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.g;
import net.minecraft.client.g.a.p;
import net.minecraft.l.a.b;
import net.minecraft.u.bp;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class k
extends g {
    public String a = "";
    private static final d h = org.apache.logging.log4j.c.c();
    protected final bp b;

    public k(bp bp2) {
        this.b = bp2;
    }

    @Override
    public void a(s s2) {
        this.f();
        an an2 = null;
        try {
            an2 = s2.a(this.b);
            BufferedImage bufferedImage = null;
            if (this.a != "") {
                try {
                    bufferedImage = net.minecraft.l.a.b.a(this.a);
                }
                catch (InvalidKeyException invalidKeyException) {
                    invalidKeyException.printStackTrace();
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    noSuchAlgorithmException.printStackTrace();
                }
                catch (NoSuchPaddingException noSuchPaddingException) {
                    noSuchPaddingException.printStackTrace();
                }
                catch (IllegalBlockSizeException illegalBlockSizeException) {
                    illegalBlockSizeException.printStackTrace();
                }
                catch (BadPaddingException badPaddingException) {
                    badPaddingException.printStackTrace();
                }
            } else if (net.minecraft.l.k.e) {
                try {
                    bufferedImage = net.minecraft.l.a.b.a("data/6.bin");
                }
                catch (InvalidKeyException invalidKeyException) {
                    invalidKeyException.printStackTrace();
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    noSuchAlgorithmException.printStackTrace();
                }
                catch (NoSuchPaddingException noSuchPaddingException) {
                    noSuchPaddingException.printStackTrace();
                }
                catch (IllegalBlockSizeException illegalBlockSizeException) {
                    illegalBlockSizeException.printStackTrace();
                }
                catch (BadPaddingException badPaddingException) {
                    badPaddingException.printStackTrace();
                }
            } else {
                bufferedImage = p.a(an2.b());
            }
            boolean bl2 = false;
            boolean bl3 = false;
            if (an2.c()) {
                try {
                    h h2 = (h)an2.a("texture");
                    if (h2 != null) {
                        bl2 = h2.a();
                        bl3 = h2.b();
                    }
                }
                catch (RuntimeException runtimeException) {
                    h.f("Failed reading metadata of: {}", this.b, runtimeException);
                }
            }
            p.a(this.e(), bufferedImage, bl2, bl3);
        }
        catch (Throwable throwable) {
            t.a(an2);
            throw throwable;
        }
        t.a(an2);
    }

    public BufferedImage a(BufferedImage bufferedImage) {
        for (int i2 = 0; i2 < bufferedImage.getWidth(); ++i2) {
            for (int i3 = 0; i3 < bufferedImage.getHeight(); ++i3) {
                int n2 = bufferedImage.getRGB(i2, i3);
                Color color = new Color(n2, true);
                color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                bufferedImage.setRGB(i2, i3, color.getRGB());
            }
        }
        return bufferedImage;
    }
}

