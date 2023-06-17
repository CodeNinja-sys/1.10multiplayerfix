/*
 * Decompiled with CFR 0.150.
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class brg
extends InputStream {
    private final InputStream a;
    private final String b;
    private boolean c;

    public brg(InputStream inputStream, bpx bpx2, String string) {
        this.a = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.b = "Leaked resource: '" + bpx2 + "' loaded from pack: '" + string + "'\n" + byteArrayOutputStream;
    }

    @Override
    public void close() {
        this.a.close();
        this.c = true;
    }

    protected void finalize() {
        if (!this.c) {
            aae.b().f(this.b);
        }
        super.finalize();
    }

    @Override
    public int read() {
        return this.a.read();
    }
}

