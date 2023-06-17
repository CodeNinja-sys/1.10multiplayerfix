/*
 * Decompiled with CFR 0.150.
 */
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class cpm
extends URLConnection {
    final /* synthetic */ brb a;

    cpm(brb brb2, URL uRL) {
        this.a = brb2;
        super(uRL);
    }

    @Override
    public void connect() {
    }

    @Override
    public InputStream getInputStream() {
        return bxy.B().Q().a(this.a.a).b();
    }
}

