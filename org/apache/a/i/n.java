/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.util.Locale;
import org.apache.a.al;
import org.apache.a.o.a;

public class n
implements al {
    public static final n a = new n();
    private static final String[][] b = new String[][]{null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    protected n() {
    }

    public String a(int n2, Locale locale) {
        org.apache.a.o.a.a(n2 >= 100 && n2 < 600, "Unknown category for status code " + n2);
        int n3 = n2 / 100;
        int n4 = n2 - 100 * n3;
        String string = null;
        if (b[n3].length > n4) {
            string = b[n3][n4];
        }
        return string;
    }

    private static void a(int n2, String string) {
        int n3 = n2 / 100;
        int n4 = n2 - 100 * n3;
        n.b[n3][n4] = string;
    }

    static {
        n.a(200, "OK");
        n.a(201, "Created");
        n.a(202, "Accepted");
        n.a(204, "No Content");
        n.a(301, "Moved Permanently");
        n.a(302, "Moved Temporarily");
        n.a(304, "Not Modified");
        n.a(400, "Bad Request");
        n.a(401, "Unauthorized");
        n.a(403, "Forbidden");
        n.a(404, "Not Found");
        n.a(500, "Internal Server Error");
        n.a(501, "Not Implemented");
        n.a(502, "Bad Gateway");
        n.a(503, "Service Unavailable");
        n.a(100, "Continue");
        n.a(307, "Temporary Redirect");
        n.a(405, "Method Not Allowed");
        n.a(409, "Conflict");
        n.a(412, "Precondition Failed");
        n.a(413, "Request Too Long");
        n.a(414, "Request-URI Too Long");
        n.a(415, "Unsupported Media Type");
        n.a(300, "Multiple Choices");
        n.a(303, "See Other");
        n.a(305, "Use Proxy");
        n.a(402, "Payment Required");
        n.a(406, "Not Acceptable");
        n.a(407, "Proxy Authentication Required");
        n.a(408, "Request Timeout");
        n.a(101, "Switching Protocols");
        n.a(203, "Non Authoritative Information");
        n.a(205, "Reset Content");
        n.a(206, "Partial Content");
        n.a(504, "Gateway Timeout");
        n.a(505, "Http Version Not Supported");
        n.a(410, "Gone");
        n.a(411, "Length Required");
        n.a(416, "Requested Range Not Satisfiable");
        n.a(417, "Expectation Failed");
        n.a(102, "Processing");
        n.a(207, "Multi-Status");
        n.a(422, "Unprocessable Entity");
        n.a(419, "Insufficient Space On Resource");
        n.a(420, "Method Failure");
        n.a(423, "Locked");
        n.a(507, "Insufficient Storage");
        n.a(424, "Failed Dependency");
    }
}

