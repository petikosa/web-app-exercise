export interface OpeningHours {
  id: number;
  start: number;
  end: number;
  note: string;
}

export interface Day {
  id: number;
  day: number;
  openingHours: OpeningHours[]
}

export interface Place {
  id: number;
  name: number;
  address: number;
  days: Day[]
}