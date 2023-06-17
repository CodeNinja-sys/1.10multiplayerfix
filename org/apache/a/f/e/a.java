/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.a.f.e.p;
import org.apache.commons.d.c;

public abstract class a
implements p {
    private static final String[] a = new String[]{"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
    private final org.apache.commons.d.a b = c.b(this.getClass());

    public final void a(String string, SSLSocket sSLSocket) {
        Certificate[] arrcertificate;
        if (string == null) {
            throw new NullPointerException("host to verify is null");
        }
        SSLSession sSLSession = sSLSocket.getSession();
        if (sSLSession == null) {
            arrcertificate = sSLSocket.getInputStream();
            arrcertificate.available();
            sSLSession = sSLSocket.getSession();
            if (sSLSession == null) {
                sSLSocket.startHandshake();
                sSLSession = sSLSocket.getSession();
            }
        }
        arrcertificate = sSLSession.getPeerCertificates();
        X509Certificate x509Certificate = (X509Certificate)arrcertificate[0];
        this.a(string, x509Certificate);
    }

    public final boolean verify(String string, SSLSession sSLSession) {
        try {
            Certificate[] arrcertificate = sSLSession.getPeerCertificates();
            X509Certificate x509Certificate = (X509Certificate)arrcertificate[0];
            this.a(string, x509Certificate);
            return true;
        }
        catch (SSLException sSLException) {
            return false;
        }
    }

    public final void a(String string, X509Certificate x509Certificate) {
        String[] arrstring = org.apache.a.f.e.a.a(x509Certificate);
        String[] arrstring2 = org.apache.a.f.e.a.a(x509Certificate, string);
        this.a(string, arrstring, arrstring2);
    }

    public final void a(String string, String[] arrstring, String[] arrstring2, boolean bl2) {
        Object object;
        LinkedList<String> linkedList = new LinkedList<String>();
        if (arrstring != null && arrstring.length > 0 && arrstring[0] != null) {
            linkedList.add(arrstring[0]);
        }
        if (arrstring2 != null) {
            for (String object22 : arrstring2) {
                if (object22 == null) continue;
                linkedList.add(object22);
            }
        }
        if (linkedList.isEmpty()) {
            object = "Certificate for <" + string + "> doesn't contain CN or DNS subjectAlt";
            throw new SSLException((String)object);
        }
        object = new StringBuilder();
        String string2 = this.e(string.trim().toLowerCase(Locale.US));
        int n2 = 0;
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String[] arrstring3;
            boolean bl3;
            String string3 = (String)iterator.next();
            string3 = string3.toLowerCase(Locale.US);
            ((StringBuilder)object).append(" <");
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append('>');
            if (iterator.hasNext()) {
                ((StringBuilder)object).append(" OR");
            }
            boolean bl4 = bl3 = (arrstring3 = string3.split("\\.")).length >= 3 && arrstring3[0].endsWith("*") && this.b(string3) && !org.apache.a.f.e.a.d(string);
            if (bl3) {
                String string4 = arrstring3[0];
                if (string4.length() > 1) {
                    String string5 = string4.substring(0, string4.length() - 1);
                    String string6 = string3.substring(string4.length());
                    String string7 = string2.substring(string5.length());
                    n2 = string2.startsWith(string5) && string7.endsWith(string6) ? 1 : 0;
                } else {
                    n2 = string2.endsWith(string3.substring(1)) ? 1 : 0;
                }
                if (n2 != 0 && bl2) {
                    n2 = org.apache.a.f.e.a.c(string2) == org.apache.a.f.e.a.c(string3) ? 1 : 0;
                }
            } else {
                n2 = string2.equals(this.e(string3)) ? 1 : 0;
            }
            if (n2 == 0) continue;
            break;
        }
        if (n2 == 0) {
            throw new SSLException("hostname in certificate didn't match: <" + string + "> !=" + object);
        }
    }

    public static boolean a(String string) {
        String[] arrstring = string.split("\\.");
        if (arrstring.length != 3 || arrstring[2].length() != 2) {
            return true;
        }
        return Arrays.binarySearch(a, arrstring[1]) < 0;
    }

    boolean b(String string) {
        String[] arrstring = string.split("\\.");
        if (arrstring.length != 3 || arrstring[2].length() != 2) {
            return true;
        }
        return Arrays.binarySearch(a, arrstring[1]) < 0;
    }

    public static String[] a(X509Certificate x509Certificate) {
        String[] arrstring;
        LinkedList<String> linkedList = new LinkedList<String>();
        String string = x509Certificate.getSubjectX500Principal().toString();
        StringTokenizer stringTokenizer = new StringTokenizer(string, ",+");
        while (stringTokenizer.hasMoreTokens()) {
            arrstring = stringTokenizer.nextToken().trim();
            if (arrstring.length() <= 3 || !arrstring.substring(0, 3).equalsIgnoreCase("CN=")) continue;
            linkedList.add(arrstring.substring(3));
        }
        if (!linkedList.isEmpty()) {
            arrstring = new String[linkedList.size()];
            linkedList.toArray(arrstring);
            return arrstring;
        }
        return null;
    }

    private static String[] a(X509Certificate x509Certificate, String string) {
        int n2 = org.apache.a.f.e.a.d(string) ? 7 : 2;
        LinkedList<String> linkedList = new LinkedList<String>();
        Collection<List<?>> collection = null;
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        }
        catch (CertificateParsingException certificateParsingException) {
            // empty catch block
        }
        if (collection != null) {
            for (List list : collection) {
                List list2 = list;
                int n3 = (Integer)list2.get(0);
                if (n3 != n2) continue;
                String string2 = (String)list2.get(1);
                linkedList.add(string2);
            }
        }
        if (!linkedList.isEmpty()) {
            String[] arrstring = new String[linkedList.size()];
            linkedList.toArray(arrstring);
            return arrstring;
        }
        return null;
    }

    public static String[] b(X509Certificate x509Certificate) {
        return org.apache.a.f.e.a.a(x509Certificate, null);
    }

    public static int c(String string) {
        int n2 = 0;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string.charAt(i2) != '.') continue;
            ++n2;
        }
        return n2;
    }

    private static boolean d(String string) {
        return string != null && (org.apache.a.f.f.a.a(string) || org.apache.a.f.f.a.e(string));
    }

    private String e(String string) {
        if (string == null || !org.apache.a.f.f.a.e(string)) {
            return string;
        }
        try {
            InetAddress inetAddress = InetAddress.getByName(string);
            return inetAddress.getHostAddress();
        }
        catch (UnknownHostException unknownHostException) {
            this.b.e("Unexpected error converting " + string, unknownHostException);
            return string;
        }
    }

    static {
        Arrays.sort(a);
    }
}

