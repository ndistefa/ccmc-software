#include "Point3f.h"
#include <cmath>
#include <sstream>

namespace ccmc
{
	/**
	 * @param out
	 * @param point
	 * @return
	 */
	ostream& operator<<(ostream& out, const Point3f point)
	{
		out << point.toString();
		return out;
	}

	/**
	 * TODO: finish documentation
	 * @param component1
	 * @param component2
	 * @param component3
	 */
	Point3f::Point3f(const float component1, const float component2, const float component3)
	{
		this->component1 = component1;
		this->component2 = component2;
		this->component3 = component3;
		coordinates = Point3f::CARTESIAN;
	}

	/**
	 * TODO: finish documentation
	 * @param component1
	 * @param component2
	 * @param component3
	 */
	Point3f::Point3f(const float component1, const float component2, const float component3, Coordinates c)
	{
		this->component1 = component1;
		this->component2 = component2;
		this->component3 = component3;
		coordinates = c;
	}

	/*Point3f::Point3f(const Point3f& p)
	 {
	 this->component1 = p.component1;
	 this->component2 = p.component2;
	 this->component3 = p.component3;
	 }*/

	/**
	 * TODO: finish documentation
	 */
	Point3f::Point3f()
	{
		component1 = 0.0;
		component2 = 0.0;
		component3 = 0.0;
	}

	/**
	 * TODO: finish documentation
	 */
	Point3f::Point3f(Coordinates c)
	{
		component1 = 0.0;
		component2 = 0.0;
		component3 = 0.0;
		coordinates = c;
	}

	/**
	 * TODO: finish documentation
	 */
	Point3f::~Point3f()
	{

	}

	/**
	 * TODO: finish documentation
	 */
	Point3f Point3f::operator+(const Point3f& p) const
	{
		Point3f point;
		point.component1 = component1 + p.component1;
		point.component2 = component2 + p.component2;
		point.component3 = component3 + p.component3;
		point.coordinates = p.coordinates;

		return point;
	}

	/**
	 * TODO: finish documentation
	 */
	Point3f Point3f::operator*(float value) const
	{
		Point3f point;
		point.component1 = component1 * value;
		point.component2 = component2 * value;
		point.component3 = component3 * value;

		return point;
	}

	/**
	 * TODO: finish documentation
	 */
	Point3f Point3f::operator*(double value) const
	{
		Point3f point;
		point.component1 = component1 * value;
		point.component2 = component2 * value;
		point.component3 = component3 * value;
		return point;
	}

	/** compute the distance between this point, and Point p **/
	/**
	 * TODO: finish documentation
	 */
	float Point3f::distance(const Point3f& p) const
	{
		float dist;

		if (coordinates == Point3f::SPHERICAL)
		{
			//r p t
			float cartesianComponent1 = component1 * cos(component3 * 0.01714532925) * sin(1.5707 + component2
					* 0.0174532925);
			float cartesianComponent2 = component1 * sin(component3 * 0.01714532925) * sin(1.5707 + component2
					* 0.0174532925);
			float cartesianComponent3 = -1.0 * component1 * cos(1.5707 + component2 * 0.0174532925);

			float pCartesianComponent1 = p.component1 * cos(p.component3 * 0.01714532925) * sin(1.5707 + p.component2
					* 0.0174532925);
			float pCartesianComponent2 = p.component1 * sin(p.component3 * 0.01714532925) * sin(1.5707 + p.component2
					* 0.0174532925);
			float pCartesianComponent3 = -1.0 * p.component1 * cos(1.5707 + p.component2 * 0.0174532925);

			float diff1 = cartesianComponent1 - pCartesianComponent1;
			float diff2 = cartesianComponent2 - pCartesianComponent2;
			float diff3 = cartesianComponent3 - pCartesianComponent3;

			dist = sqrt(diff1 * diff1 + diff2 * diff2 + diff3 * diff3);
		} else
		{
			dist = sqrt((component1 - p.component1) * (component1 - p.component1) + (component2 - p.component2)
					* (component2 - p.component2) + (component3 - p.component3) * (component3 - p.component3));
		}
		return dist;
	}

	/**
	 * TODO: finish documentation
	 */
	void Point3f::normalize()
	{

		float mag = magnitude();
		if (abs(mag - 0.0) > .0000001)
		{
			component1 /= mag;
			component2 /= mag;
			component3 /= mag;
		}
	}

	/**
	 * TODO: finish documentation
	 */
	float Point3f::magnitude()
	{
		return sqrt(component1 * component1 + component2 * component2 + component3 * component3);
	}

	/**
	 * TODO: finish documentation
	 */
	string Point3f::toString() const
	{
		string beg = "(";
		string mid = ",";
		string end = ")";
		ostringstream oss1;
		oss1 << component1;
		string scomponent1 = oss1.str();
		ostringstream oss2;
		oss2 << component2;
		string scomponent2 = oss2.str();
		ostringstream oss3;
		oss3 << component3;
		string scomponent3 = oss3.str();
		string str = beg + scomponent1 + mid + scomponent2 + mid + scomponent3 + end;
		return str;
	}

	/**
	 * TODO: finish documentation
	 */
	void Point3f::setCoordinates(Point3f::Coordinates c)
	{
		coordinates = c;
	}

	/**
	 * TODO: finish documentation
	 */
	Point3f::Coordinates Point3f::getCoordinates()
	{
		return coordinates;
	}

}