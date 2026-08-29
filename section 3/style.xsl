<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" encoding="UTF-8" />

    <xsl:template match="/">
        <html>
            <head>
                <title>My BOOK Collection</title>
                <style>
                    body {
                        margin: 0;
                        padding: 28px 20px;
                        background: #ffffff;
                        color: #111111;
                        font-family: "Times New Roman", serif;
                    }

                    h2 {
                        margin: 0 0 30px;
                        font-size: 36px;
                        text-align: center;
                    }

                    table {
                        width: 92%;
                        margin: 0 auto;
                        border-collapse: collapse;
                        border: 2px solid #c8c8c8;
                        font-size: 22px;
                    }

                    th,
                    td {
                        padding: 5px 7px;
                        border: 2px solid #c8c8c8;
                        text-align: left;
                        white-space: nowrap;
                    }

                    th {
                        background: #808080;
                        color: #ffffff;
                        text-align: center;
                    }

                    .author {
                        background: #000000;
                        color: #ffffff;
                        font-weight: bold;
                    }

                    @media (max-width: 750px) {
                        body {
                            padding: 20px 8px;
                            overflow-x: auto;
                        }

                        h2 {
                            font-size: 28px;
                        }

                        table {
                            width: 100%;
                            font-size: 16px;
                        }
                    }
                </style>
            </head>
            <body>
                <h2>My BOOK Collection</h2>
                <table>
                    <tr>
                        <th>BOOK_NAME</th>
                        <th>Author</th>
                        <th>ISBN</th>
                        <th>Publisher</th>
                        <th>Edition</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="BOOKS/INFORMATION/Book">
                        <tr>
                            <td><xsl:value-of select="book_name" /></td>
                            <td class="author"><xsl:value-of select="Author_name" /></td>
                            <td><xsl:value-of select="ISBN_number" /></td>
                            <td><xsl:value-of select="publisher" /></td>
                            <td><xsl:value-of select="Edition" /></td>
                            <td><xsl:value-of select="Price" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
