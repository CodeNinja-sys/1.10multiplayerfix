/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.b.bi;
import io.netty.c.a.a.a;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class n {
    private static final g a = h.a(n.class);
    private static final Pattern b = Pattern.compile("-+BEGIN\\s+.*CERTIFICATE[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*CERTIFICATE[^-]*-+", 2);
    private static final Pattern c = Pattern.compile("-+BEGIN\\s+.*PRIVATE\\s+KEY[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*PRIVATE\\s+KEY[^-]*-+", 2);

    static io.netty.b.g[] a(File file) {
        String string;
        try {
            string = n.c(file);
        }
        catch (IOException iOException) {
            throw new CertificateException("failed to read a file: " + file, iOException);
        }
        ArrayList<io.netty.b.g> arrayList = new ArrayList<io.netty.b.g>();
        Matcher matcher = b.matcher(string);
        int n2 = 0;
        while (matcher.find(n2)) {
            io.netty.b.g g2 = bi.a(matcher.group(1), e.f);
            io.netty.b.g g3 = io.netty.c.a.a.a.b(g2);
            g2.ad();
            arrayList.add(g3);
            n2 = matcher.end();
        }
        if (arrayList.isEmpty()) {
            throw new CertificateException("found no certificates: " + file);
        }
        return arrayList.toArray(new io.netty.b.g[arrayList.size()]);
    }

    static io.netty.b.g b(File file) {
        String string;
        try {
            string = n.c(file);
        }
        catch (IOException iOException) {
            throw new KeyException("failed to read a file: " + file, iOException);
        }
        Matcher matcher = c.matcher(string);
        if (!matcher.find()) {
            throw new KeyException("found no private key: " + file);
        }
        io.netty.b.g g2 = bi.a(matcher.group(1), e.f);
        io.netty.b.g g3 = io.netty.c.a.a.a.b(g2);
        g2.ad();
        return g3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int n2;
            byte[] arrby = new byte[8192];
            while ((n2 = ((InputStream)fileInputStream).read(arrby)) >= 0) {
                byteArrayOutputStream.write(arrby, 0, n2);
            }
            String string = byteArrayOutputStream.toString(e.f.name());
            return string;
        }
        finally {
            n.a(fileInputStream);
            n.a(byteArrayOutputStream);
        }
    }

    private static void a(InputStream inputStream) {
        try {
            inputStream.close();
        }
        catch (IOException iOException) {
            a.d("Failed to close a stream.", iOException);
        }
    }

    private static void a(OutputStream outputStream) {
        try {
            outputStream.close();
        }
        catch (IOException iOException) {
            a.d("Failed to close a stream.", iOException);
        }
    }

    private n() {
    }
}

