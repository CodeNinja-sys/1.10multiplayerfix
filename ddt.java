/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.b.t;

public class ddt {
    public final int a;
    public final int b;

    public ddt(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readLong() != -8552249625308161526L) {
            throw new IOException("Bad PNG Signature");
        }
        if (dataInputStream.readInt() != 13) {
            throw new IOException("Bad length for IHDR chunk!");
        }
        if (dataInputStream.readInt() != 1229472850) {
            throw new IOException("Bad type for IHDR chunk!");
        }
        this.a = dataInputStream.readInt();
        this.b = dataInputStream.readInt();
        t.a(dataInputStream);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ddt a(dbr dbr2) {
        try {
            ddt ddt2 = new ddt(dbr2.b());
            return ddt2;
        }
        finally {
            t.a(dbr2);
        }
    }
}

