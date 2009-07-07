/*
 * OpenGGCM.h
 *
 *  Created on: Jun 2, 2009
 *      Author: David Berrios
 */

#ifndef OPENGGCM_H_
#define OPENGGCM_H_
#include <string>
#include "Cell3D.h"
#include "Model.h"
#include <vector>
#include <boost/unordered_map.hpp>

/*
 *
 */
class OpenGGCM: public Model
{

	public:
		OpenGGCM();
		long open(const std::string& filename);


		//Cell3D<float, float> getCell(std::string& variable, float c0, float c1, float c2);
		Interpolator * createNewInterpolator();
		//void loadVariable(std::string variable);
		virtual ~OpenGGCM();



	private:
		void initializeConversionFactorsToSI();
		void initializeSIUnits();

		std::string x_string;
		std::string y_string;
		std::string z_string;
		int nx;
		int ny;
		int nz;
		std::vector<float> * x_array;
		std::vector<float> * y_array;
		std::vector<float> * z_array;
		std::string previousVariable;
		long previousVariableID;
		float previousConversionFactor;
		float previous_x;
		float previous_y;
		float previous_z;
		int previous_ix;
		int previous_iy;
		int previous_iz;

};

#endif /* OPENGGCM_H_ */