/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.util.e;

public class bp
implements Comparable {
    public static final bp a = new bp(100, "Continue", true);
    public static final bp b = new bp(101, "Switching Protocols", true);
    public static final bp c = new bp(102, "Processing", true);
    public static final bp d = new bp(200, "OK", true);
    public static final bp e = new bp(201, "Created", true);
    public static final bp f = new bp(202, "Accepted", true);
    public static final bp g = new bp(203, "Non-Authoritative Information", true);
    public static final bp h = new bp(204, "No Content", true);
    public static final bp i = new bp(205, "Reset Content", true);
    public static final bp j = new bp(206, "Partial Content", true);
    public static final bp k = new bp(207, "Multi-Status", true);
    public static final bp l = new bp(300, "Multiple Choices", true);
    public static final bp m = new bp(301, "Moved Permanently", true);
    public static final bp n = new bp(302, "Found", true);
    public static final bp o = new bp(303, "See Other", true);
    public static final bp p = new bp(304, "Not Modified", true);
    public static final bp q = new bp(305, "Use Proxy", true);
    public static final bp r = new bp(307, "Temporary Redirect", true);
    public static final bp s = new bp(400, "Bad Request", true);
    public static final bp t = new bp(401, "Unauthorized", true);
    public static final bp u = new bp(402, "Payment Required", true);
    public static final bp v = new bp(403, "Forbidden", true);
    public static final bp w = new bp(404, "Not Found", true);
    public static final bp x = new bp(405, "Method Not Allowed", true);
    public static final bp y = new bp(406, "Not Acceptable", true);
    public static final bp z = new bp(407, "Proxy Authentication Required", true);
    public static final bp A = new bp(408, "Request Timeout", true);
    public static final bp B = new bp(409, "Conflict", true);
    public static final bp C = new bp(410, "Gone", true);
    public static final bp D = new bp(411, "Length Required", true);
    public static final bp E = new bp(412, "Precondition Failed", true);
    public static final bp F = new bp(413, "Request Entity Too Large", true);
    public static final bp G = new bp(414, "Request-URI Too Long", true);
    public static final bp H = new bp(415, "Unsupported Media Type", true);
    public static final bp I = new bp(416, "Requested Range Not Satisfiable", true);
    public static final bp J = new bp(417, "Expectation Failed", true);
    public static final bp K = new bp(422, "Unprocessable Entity", true);
    public static final bp L = new bp(423, "Locked", true);
    public static final bp M = new bp(424, "Failed Dependency", true);
    public static final bp N = new bp(425, "Unordered Collection", true);
    public static final bp O = new bp(426, "Upgrade Required", true);
    public static final bp P = new bp(428, "Precondition Required", true);
    public static final bp Q = new bp(429, "Too Many Requests", true);
    public static final bp R = new bp(431, "Request Header Fields Too Large", true);
    public static final bp S = new bp(500, "Internal Server Error", true);
    public static final bp T = new bp(501, "Not Implemented", true);
    public static final bp U = new bp(502, "Bad Gateway", true);
    public static final bp V = new bp(503, "Service Unavailable", true);
    public static final bp W = new bp(504, "Gateway Timeout", true);
    public static final bp X = new bp(505, "HTTP Version Not Supported", true);
    public static final bp Y = new bp(506, "Variant Also Negotiates", true);
    public static final bp Z = new bp(507, "Insufficient Storage", true);
    public static final bp aa = new bp(510, "Not Extended", true);
    public static final bp ab = new bp(511, "Network Authentication Required", true);
    private final int ac;
    private final String ad;
    private final byte[] ae;

    public static bp a(int n2) {
        switch (n2) {
            case 100: {
                return a;
            }
            case 101: {
                return b;
            }
            case 102: {
                return c;
            }
            case 200: {
                return d;
            }
            case 201: {
                return e;
            }
            case 202: {
                return f;
            }
            case 203: {
                return g;
            }
            case 204: {
                return h;
            }
            case 205: {
                return i;
            }
            case 206: {
                return j;
            }
            case 207: {
                return k;
            }
            case 300: {
                return l;
            }
            case 301: {
                return m;
            }
            case 302: {
                return n;
            }
            case 303: {
                return o;
            }
            case 304: {
                return p;
            }
            case 305: {
                return q;
            }
            case 307: {
                return r;
            }
            case 400: {
                return s;
            }
            case 401: {
                return t;
            }
            case 402: {
                return u;
            }
            case 403: {
                return v;
            }
            case 404: {
                return w;
            }
            case 405: {
                return x;
            }
            case 406: {
                return y;
            }
            case 407: {
                return z;
            }
            case 408: {
                return A;
            }
            case 409: {
                return B;
            }
            case 410: {
                return C;
            }
            case 411: {
                return D;
            }
            case 412: {
                return E;
            }
            case 413: {
                return F;
            }
            case 414: {
                return G;
            }
            case 415: {
                return H;
            }
            case 416: {
                return I;
            }
            case 417: {
                return J;
            }
            case 422: {
                return K;
            }
            case 423: {
                return L;
            }
            case 424: {
                return M;
            }
            case 425: {
                return N;
            }
            case 426: {
                return O;
            }
            case 428: {
                return P;
            }
            case 429: {
                return Q;
            }
            case 431: {
                return R;
            }
            case 500: {
                return S;
            }
            case 501: {
                return T;
            }
            case 502: {
                return U;
            }
            case 503: {
                return V;
            }
            case 504: {
                return W;
            }
            case 505: {
                return X;
            }
            case 506: {
                return Y;
            }
            case 507: {
                return Z;
            }
            case 510: {
                return aa;
            }
            case 511: {
                return ab;
            }
        }
        String string = n2 < 100 ? "Unknown Status" : (n2 < 200 ? "Informational" : (n2 < 300 ? "Successful" : (n2 < 400 ? "Redirection" : (n2 < 500 ? "Client Error" : (n2 < 600 ? "Server Error" : "Unknown Status")))));
        return new bp(n2, string + " (" + n2 + ')');
    }

    public bp(int n2, String string) {
        this(n2, string, false);
    }

    private bp(int n2, String string, boolean bl2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("code: " + n2 + " (expected: 0+)");
        }
        if (string == null) {
            throw new NullPointerException("reasonPhrase");
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            switch (c2) {
                case '\n': 
                case '\r': {
                    throw new IllegalArgumentException("reasonPhrase contains one of the following prohibited characters: \\r\\n: " + string);
                }
            }
        }
        this.ac = n2;
        this.ad = string;
        this.ae = (byte[])(bl2 ? (n2 + " " + string).getBytes(io.netty.util.e.f) : null);
    }

    public int a() {
        return this.ac;
    }

    public String b() {
        return this.ad;
    }

    public int hashCode() {
        return this.a();
    }

    public boolean equals(Object object) {
        if (!(object instanceof bp)) {
            return false;
        }
        return this.a() == ((bp)object).a();
    }

    public int a(bp bp2) {
        return this.a() - bp2.a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.ad.length() + 5);
        stringBuilder.append(this.ac);
        stringBuilder.append(' ');
        stringBuilder.append(this.ad);
        return stringBuilder.toString();
    }

    void a(g g2) {
        if (this.ae == null) {
            ar.b(String.valueOf(this.a()), g2);
            g2.B(32);
            ar.b(String.valueOf(this.b()), g2);
        } else {
            g2.c(this.ae);
        }
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((bp)object);
    }
}

