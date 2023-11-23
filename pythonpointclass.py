import math
class Point:
    def __init__(self, x=0, y=0):
        self._x = x
        self._y = y

    def x(self):
        return self._x

    def x(self, value):
        self._x = value

    def y(self):
        return self._y

    def y(self, value):
        self._y = value

    def distance(self, other_point):
        dx = self._x - other_point.x
        dy = self._y - other_point.y
        return math.sqrt(dx**2 + dy**2)

    def norme(self):
        return math.sqrt(self._x**2 + self._y**2)

# Test the Point class

point1 = Point(3, 4)
point2 = Point(7, 6)

print(f"Point 1 - X: {point1.x}, Y: {point1.y}")
print(f"Point 2 - X: {point2.x}, Y: {point2.y}")

point1.x = 5
point2.y = 2

print(f"Point 1 - X: {point1.x}, Y: {point1.y}")
print(f"Point 2 - X: {point2.x}, Y: {point2.y}")

distance_between_points = point1.distance(point2)
print(f"Distance between points: {distance_between_points}")

norm_point1 = point1.norme()
print(f"Norm of Point 1: {norm_point1}")
