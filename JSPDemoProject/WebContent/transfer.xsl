<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">

		<html>
			<body>
				<h2>Vegitable Details</h2>
				<table border="2">
					<tr>
						<th align="left">Name
						</th>
						<th align="left">Price
						</th>
					</tr>
					<xsl:for-each select="vegetables/vegetable">
						<tr>
							<td>
								<xsl:value-of select="name" />
							</td>
							<td>
								<xsl:value-of select="price" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>