/*
 * Decompiled with CFR 0.150.
 */
package b.b;

import b.af;
import b.ag;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class b
implements ag {
    public InetAddress b(String string) {
        try {
            return InetAddress.getByName(string);
        }
        catch (UnknownHostException unknownHostException) {
            throw new af("Cannot convert value [" + string + " into an InetAddress", unknownHostException);
        }
    }

    public Class a() {
        return InetAddress.class;
    }

    public String b() {
        return null;
    }

    public /* synthetic */ Object a(String string) {
        return this.b(string);
    }
}

