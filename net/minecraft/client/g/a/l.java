/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.minecraft.client.f.an;
import org.apache.commons.b.t;

public class l {
    public final int a;
    public final int b;

    public l(InputStream inputStream) {
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

    public static l a(an an2) {
        l l2;
        try {
            l2 = new l(an2.b());
        }
        finally {
            t.a(an2);
        }
        return l2;
    }
}

