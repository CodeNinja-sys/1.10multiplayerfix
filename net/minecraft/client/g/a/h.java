/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import com.a.a.d.ov;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.g;
import net.minecraft.client.g.a.p;
import net.minecraft.u.bp;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class h
extends g {
    private static final d b = org.apache.logging.log4j.c.c();
    public final List a;

    public h(String ... arrstring) {
        this.a = ov.a(arrstring);
    }

    @Override
    public void a(s s2) {
        this.f();
        BufferedImage bufferedImage = null;
        for (String string : this.a) {
            an an2;
            block6: {
                an2 = null;
                try {
                    if (string == null) break block6;
                    an2 = s2.a(new bp(string));
                    BufferedImage bufferedImage2 = p.a(an2.b());
                    if (bufferedImage == null) {
                        bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), 2);
                    }
                    bufferedImage.getGraphics().drawImage(bufferedImage2, 0, 0, null);
                }
                catch (IOException iOException) {
                    try {
                        b.b("Couldn't load layered image", (Throwable)iOException);
                    }
                    catch (Throwable throwable) {
                        t.a(an2);
                        throw throwable;
                    }
                    t.a(an2);
                }
            }
            t.a(an2);
            continue;
            return;
        }
        p.a(this.e(), bufferedImage);
    }
}

