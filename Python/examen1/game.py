
class Position:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Point[{self.x},{self.y}]"


class Weapon:
    def __init__(self,name, damage, wepon_range):
        self.name = name
        self.damage = damage
        self.wepon_range = wepon_range

    def __str__(self):
        return f"[{self.name}],[{self.damage}],[{self.wepon_range}]"

class Player:
    def __init__(self,name, position, health, status):
        self.name = name
        self.position = position
        self.health = health
        self.status = status
    def __str__(self):
        return f"[{self.name}],[{self.position}],[{self.health}],[{self.status}]"