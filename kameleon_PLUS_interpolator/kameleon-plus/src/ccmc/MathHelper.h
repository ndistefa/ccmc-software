/*
 * Math.h
 *
 *  Created on: Nov 3, 2010
 *      Author: dberrios
 */

#ifndef CCMC_MATHHELPER_H_
#define CCMC_MATHHELPER_H_

namespace ccmc
{
	/*
	 *
	 */
	class Math
	{

		public:
			static int iminloc1d(int * array, long n, int * mask);
			static int imaxloc1d(int * array, long n, int * mask);
			static int fminloc1d(float * array, long n, int * mask);
			static int fmaxloc1d(float * array, long n, int * mask);
			static int dminloc1d(double * array, long n, int * mask);
			static int dmaxloc1d(double * array, long n, int * mask);
			static int ifindmin(int * array, long n);
			static int ifindmax(int * array, long n);
			static long lfindmin(long * array, long n);
			static long lfindmax(long * array, long n);
			static float ffindmin(float * array, long n);
			static float ffindmax(float * array, long n);
			static double dfindmin(double * array, long n);
			static double dfindmax(double * array, long n);

	};
}

#endif /* CCMC_MATHHELPER_H_ */
