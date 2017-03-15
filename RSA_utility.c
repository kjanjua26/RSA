
/********************************************************************************
 * Finds an integer d such that ed [=] 1 (mod phi)								*
 * Since we know e and phi it uses Euclidean Algorithm to find the inverse of a	*
 * Note de + phij = 1 Considering e is inverse of d and j is inverse of phi		*
 ********************************************************************************/
unsigned long long findd( unsigned long long e, unsigned long long phi)
{
	unsigned long long x, y, u, v, m, n, a, b, q, r;
	/* phi = e(0) + phi(1) */
	x = 0; y = 1;

	/* e = e(1) + phi(0) */
	u = 1; v = 0;
	for (a = e, b = phi; 0 != a; b = a, a = r, x = u, y = v, u = m, v = n)
	{
		/* b = aq + r and 0 <= r < a */
		q = b / a;
		r = b % a;

		/* r = Ax + By - aq = Ax + By - (Au + Bv)q = pe(x - uq) + pphi(y - vq) */
		m = x - (u * q);
		n = y - (v * q);
	}

	/* Ax + By = gcd(e, phi) */
	// b contains the gcd and had better be 1
	// d is the sum of x and m.
	return m + x;
}

/***************************************
 * Checks that e and phi are coprimes. *
 ***************************************/
bool is_coprime( unsigned long long e, unsigned long long phi )
{
	for( unsigned long long i = 3; i < e; i += 2 )
	{
		if ( e % i == 0 && phi % i == 0)
		return false;
	}

	return true;
}