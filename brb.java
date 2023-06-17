/*
 * Decompiled with CFR 0.150.
 */
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

final class brb
extends URLStreamHandler {
    final /* synthetic */ bpx a;

    brb(bpx bpx2) {
        this.a = bpx2;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new cpm(this, uRL);
    }
}

