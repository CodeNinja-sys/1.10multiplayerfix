/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import java.io.File;
import java.net.SocketAddress;

public class aqq
extends aic {
    public aqq(File file) {
        super(file);
    }

    @Override
    protected bhk a(z z2) {
        return new zn(z2);
    }

    public boolean a(SocketAddress socketAddress) {
        String string = this.c(socketAddress);
        return this.d(string);
    }

    public zn b(SocketAddress socketAddress) {
        String string = this.c(socketAddress);
        return (zn)this.b(string);
    }

    private String c(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (string.contains("/")) {
            string = string.substring(string.indexOf(47) + 1);
        }
        if (string.contains(":")) {
            string = string.substring(0, string.indexOf(58));
        }
        return string;
    }
}

