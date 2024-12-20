import wsgiref.validate


class Position:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Point[{self.x},{self.y}]"


class Weapon:
    def __init__(self, name, damage, wepon_range):
        self.name = name
        self.validate_damage = damage
        self.wepon_range = wepon_range

    def __validate_damage(self, damage):
        if not 1 <= damage <= 100:
            raise ValueError("Damage no esta dins els valors possibles")

    def __str__(self):
        return f"The weapon name is[{self.name}], the damage is[{self.validate_damage}] and the range is [{self.wepon_range}]"


class Player:
    def __init__(self, name, position, weapon=None, health=100, status="Alive"):
        self.name = name
        self.position = position
        if weapon is None:
            self.weapon = Weapon("Deafault", 10, 1.5)
        else:
            self.weapon = weapon
        self.health = health
        self.status = status

    def __str__(self):
        return f"The player name is [{self.name}], his position is [{self.position}], his weapon is [{self.weapon}] his health [{self.health}]and his status is [{self.status}]"
