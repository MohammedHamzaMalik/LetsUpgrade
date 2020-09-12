import math
from math import pi


class Cone:

    """A Cone class with a radius and Height"""
    def __init__(self, radius=1.0, height=1.0):
        """Initializer with default radius of 1.0"""
        """Initializer with default radius of 1.0"""
        self.radius = radius  # Create an instance variable radius
        self.height = height  # Create an instance variable height

    def __str__(self):
        """Return a descriptive string for this instance, invoked by print() and str()"""
        return 'This is a cone with radius of {:.2f} and height of {:.2f}'.format(self.radius, self.height)

    def __repr__(self):
        """Return a formal string that can be used to re-create this instance, invoked by repr()"""
        return 'Cone(radius={})'.format(self.radius)

    def get_volume(self):
        """Return the volume of this Cone instance"""
        return 'The volume of cone is', self.radius * self.radius * pi

    def get_area(self):
        """Return the area of this Cone instance"""
        return 'The area of cone is', math.pi * self.radius * (((self.radius * self.radius) + (self.height * self.height)) ** 0.5)


cone = Cone(3, 5)
print(cone)

print(cone.get_area())
print(cone.get_volume())
