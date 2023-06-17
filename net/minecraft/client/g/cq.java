/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.awt.image.BufferedImage;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import net.minecraft.client.g.a.p;
import net.minecraft.client.g.h;
import net.minecraft.client.r;
import org.apache.commons.b.o;

class cq
extends Thread {
    final /* synthetic */ h a;

    cq(h h2, String string) {
        this.a = h2;
        super(string);
    }

    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        h.b().a("Downloading http texture from {} to {}", h.a(this.a), h.b(this.a));
        try {
            httpURLConnection = (HttpURLConnection)new URL(h.a(this.a)).openConnection(r.z().M());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                BufferedImage bufferedImage;
                if (h.b(this.a) != null) {
                    o.a(httpURLConnection.getInputStream(), h.b(this.a));
                    bufferedImage = ImageIO.read(h.b(this.a));
                } else {
                    bufferedImage = p.a(httpURLConnection.getInputStream());
                }
                if (h.c(this.a) != null) {
                    bufferedImage = h.c(this.a).a(bufferedImage);
                }
                this.a.b(bufferedImage);
                return;
            }
        }
        catch (Exception exception) {
            h.b().b("Couldn't download http texture", (Throwable)exception);
            return;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}

