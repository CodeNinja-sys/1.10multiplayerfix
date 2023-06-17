/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class dbf
extends chb {
    private static final d g = org.apache.logging.log4j.c.c();
    public final List f;

    public dbf(String ... arrstring) {
        this.f = ov.a(arrstring);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(akx akx2) {
        this.e();
        BufferedImage bufferedImage = null;
        for (String string : this.f) {
            dbr dbr2 = null;
            try {
                if (string == null) continue;
                dbr2 = akx2.a(new bpx(string));
                BufferedImage bufferedImage2 = anq.a(dbr2.b());
                if (bufferedImage == null) {
                    bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), 2);
                }
                bufferedImage.getGraphics().drawImage(bufferedImage2, 0, 0, null);
                t.a(dbr2);
            }
            catch (IOException iOException) {
                g.b("Couldn't load layered image", (Throwable)iOException);
                return;
            }
            finally {
                t.a(dbr2);
            }
        }
        anq.a(this.aF_(), bufferedImage);
    }
}

