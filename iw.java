/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class iw
extends chb {
    private static final d f = org.apache.logging.log4j.c.c();
    private final bpx g;
    private final List h;
    private final List i;

    public iw(bpx bpx2, List list, List list2) {
        this.g = bpx2;
        this.h = list;
        this.i = list2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(akx akx2) {
        BufferedImage bufferedImage;
        this.e();
        dbr dbr2 = null;
        try {
            dbr2 = akx2.a(this.g);
            BufferedImage bufferedImage2 = anq.a(dbr2.b());
            int n2 = bufferedImage2.getType();
            if (n2 == 0) {
                n2 = 6;
            }
            bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), n2);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.drawImage(bufferedImage2, 0, 0, null);
            for (int i2 = 0; i2 < 17 && i2 < this.h.size() && i2 < this.i.size(); ++i2) {
                BufferedImage bufferedImage3;
                bif bif2;
                dbr dbr3;
                block13: {
                    String string;
                    block12: {
                        dbr3 = null;
                        string = (String)this.h.get(i2);
                        bif2 = ((dck)this.i.get(i2)).e();
                        if (string != null) break block12;
                        t.a(dbr3);
                        continue;
                    }
                    dbr3 = akx2.a(new bpx(string));
                    bufferedImage3 = anq.a(dbr3.b());
                    if (bufferedImage3.getWidth() == bufferedImage.getWidth() && bufferedImage3.getHeight() == bufferedImage.getHeight() && bufferedImage3.getType() == 6) break block13;
                    t.a(dbr3);
                    continue;
                }
                try {
                    for (int i3 = 0; i3 < bufferedImage3.getHeight(); ++i3) {
                        for (int i4 = 0; i4 < bufferedImage3.getWidth(); ++i4) {
                            int n3 = bufferedImage3.getRGB(i4, i3);
                            if ((n3 & 0xFF000000) == 0) continue;
                            int n4 = (n3 & 0xFF0000) << 8 & 0xFF000000;
                            int n5 = bufferedImage2.getRGB(i4, i3);
                            int n6 = cmk.d(n5, bif2.L) & 0xFFFFFF;
                            bufferedImage3.setRGB(i4, i3, n4 | n6);
                        }
                    }
                    bufferedImage.getGraphics().drawImage(bufferedImage3, 0, 0, null);
                }
                catch (Throwable throwable) {
                    t.a(dbr3);
                    throw throwable;
                }
                t.a(dbr3);
            }
        }
        catch (IOException iOException) {
            try {
                f.b("Couldn't load layered image", (Throwable)iOException);
            }
            catch (Throwable throwable) {
                t.a(dbr2);
                throw throwable;
            }
            t.a(dbr2);
            return;
        }
        t.a(dbr2);
        anq.a(this.aF_(), bufferedImage);
    }
}

