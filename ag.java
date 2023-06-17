/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import org.apache.commons.b.o;

class ag
extends Thread {
    final /* synthetic */ bjm a;

    ag(bjm bjm2, String string) {
        this.a = bjm2;
        super(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        bjm.c().a("Downloading http texture from {} to {}", bjm.a(this.a), bjm.b(this.a));
        try {
            BufferedImage bufferedImage;
            httpURLConnection = (HttpURLConnection)new URL(bjm.a(this.a)).openConnection(bxy.B().O());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                return;
            }
            if (bjm.b(this.a) != null) {
                o.a(httpURLConnection.getInputStream(), bjm.b(this.a));
                bufferedImage = ImageIO.read(bjm.b(this.a));
            } else {
                bufferedImage = anq.a(httpURLConnection.getInputStream());
            }
            if (bjm.c(this.a) != null) {
                bufferedImage = bjm.c(this.a).a(bufferedImage);
            }
            this.a.a(bufferedImage);
        }
        catch (Exception exception) {
            bjm.c().b("Couldn't download http texture", (Throwable)exception);
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}

