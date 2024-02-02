type ApiResponse<Data> = {
  isError: boolean;
  data: Data;
};

// index signatures; alternative to index signatures is using type instead of interface because interfaces
// can extend their type and have properties that don't match the key string or value of type number
interface knownProperties {
  xDir: number;
  yDir: number;
  [index: string]: number;
}

const knownProperties: knownProperties = {
  xDir: 9,
  yDir: -7,
};

type recordType = Record<string, number>;

const record: recordType = knownProperties;

// two interfaces with the same name within the same scope to demonstrate declaration merging
interface User {
  name: string;
}

interface User {
  id: string;
}

const user: User = {
  id: "123",
  name: "asterisk",
};
